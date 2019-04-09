pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }
    stage('Build') {
      steps {
        sh './gradlew build'
      }
    }
    stage('Deploy') {
      steps {
        sh './gradlew bootRun &'
      }
    }
  }
}