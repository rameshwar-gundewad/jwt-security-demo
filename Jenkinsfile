pipeline {
  agent any
  tools {
    gradle 'jenkins-gradle-8' // Name you gave in Global Tool Configuration
    jdk 'JDK_17'
  }
  parameters {
      string(name: 'GIT_BRANCH', defaultValue: 'main', description: 'Git branch to build')
    }
  stages {
   stage('Show Environment Variables') {
        steps {
          bat 'set'
        }
    }
    stage('Checkout') {
          steps {
            git branch: "${params.GIT_BRANCH}", url: 'https://github.com/rameshwar-gundewad/jwt-security-demo.git'
          }
    }
    stage('Build') {
       steps {
         echo 'Building...'
         bat 'gradlew.bat clean build' // Use 'sh' for Linux
       }
    }
    stage('Test') {
          steps {
            echo '🧪 Running tests...'
            bat 'gradlew.bat test'
          }
    }
    stage('Package') {
          steps {
            echo '📦 Packaging the application...'
            bat 'gradlew.bat bootJar'
          }
    }
    stage('Deploy') {
          steps {
            echo '🚀 Deploying the application...'
            bat '''
              taskkill /F /IM java.exe > nul 2>&1
              timeout /t 3 > nul
              start /B java -jar build\\libs\\jwt-security-demo-0.0.1-SNAPSHOT.jar --server.port=8083 > app.log 2>&1
            '''
          }
    }
    stage('Show Logs') {
          steps {
            echo '📄 Displaying app.log...'
            bat '''
              timeout /t 5 > nul
              if exist app.log (
                type app.log
              ) else (
                echo app.log not found
              )
            '''
          }
    }
  }
  post {
      success {
        echo '✅ Pipeline completed successfully.'
      }
      failure {
        echo '❌ Pipeline failed. Check logs for details.'
      }
    }
}