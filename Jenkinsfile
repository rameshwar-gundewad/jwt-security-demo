pipeline {
  agent any
  tools {
    gradle 'GRADLE_8' // Name you gave in Global Tool Configuration
  }
  stages {
    stage('Build') {
      steps {
        sh './gradlew clean build'
      }
    }
  }
}