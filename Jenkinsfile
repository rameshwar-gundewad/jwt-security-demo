pipeline {
  agent any
  tools {
    gradle 'jenkins-gradle-8' // Name you gave in Global Tool Configuration
    jdk 'JDK_17'
  }
  parameters {
      string(name: 'GIT_BRANCH', defaultValue: 'master', description: 'Git branch to build')
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
         bat 'gradlew.bat clean build -x test' // Use 'sh' for Linux
       }
    }
    stage('Test') {
          steps {
            echo 'Running tests...'
            bat 'gradlew.bat test'
          }
    }
    stage('Deploy') {
          steps {
            echo 'Deploying the application...'
            bat 'start /B java -jar build\\libs\\jwt-security-demo-0.0.1-SNAPSHOT.jar > app.log 2>&1'
          }
    }
  }
  post {
      success {
        echo 'Pipeline completed successfully.'
      }
      failure {
        echo 'Pipeline failed. Check logs for details.'
      }
    }
}