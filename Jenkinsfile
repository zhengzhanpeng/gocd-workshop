pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh './gradlew test'
      }
    }
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            sh './gradlew build'
          }
        }
        stage('xxxx') {
          steps {
            sh 'echo \'hello\''
          }
        }
      }
    }
    stage('Deploy') {
      steps {
        sh './gradlew bootRun &'
      }
    }
  }
}