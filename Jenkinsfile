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
            sh './gradlew clean build'
          }
        }
        stage('Run App') {
          steps {
            sh 'nohup ./gradlew bootRun &'
          }
       }
  }
}