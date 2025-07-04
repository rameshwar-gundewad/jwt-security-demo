pipeline {
  agent any
  tools {
    gradle 'GRADLE_8' // Name you gave in Global Tool Configuration
  }
  stages {
    stage('Checkout') {
          steps {
            git 'https://github.com/rameshwar-gundewad/jwt-security-demo.git'
          }
        }
        stage('Build') {
              steps {
                bat 'gradlew.bat clean build'
              }
            }
            stage('Run App') {
              steps {
                bat 'start /B gradlew.bat bootRun'
              }
            }
  }
}