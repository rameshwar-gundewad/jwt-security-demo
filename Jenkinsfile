pipeline {
  agent any
  tools {
    gradle 'jenkins-gradle-8' // Name you gave in Global Tool Configuration
  }
  stages {
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
          bat 'start /B gradlew.bat bootRun > bootrun.log 2>&1'
        }
    }
  }
}