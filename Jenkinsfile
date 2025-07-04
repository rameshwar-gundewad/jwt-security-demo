pipeline {
  agent any
  tools {
    gradle 'jenkins-gradle-8' // Name you gave in Global Tool Configuration
  }
  stages {
   stage('Show Environment Variables') {
        steps {
          bat 'set'
        }
    }
    stage('Checkout') {
          steps {
            git 'https://github.com/rameshwar-gundewad/jwt-security-demo.git'
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
        echo 'Testing...'
        bat 'gradlew.bat test'
      }
    }
    stage('Run App') {
      steps {
        echo 'Deploying...'
        bat 'start /B java -jar build\\libs\\jwt-security-demo-0.0.1-SNAPSHOT.jar > app.log 2>&1'
      }
    }
  }
  post {
      success {
        echo 'Pipeline completed successfully.'
      }
      failure {
        echo 'Pipeline failed.'
      }
  }
}