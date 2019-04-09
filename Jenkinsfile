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
      parallel {
        stage('Deploy') {
          steps {
            sh './gradlew bootRun &'
          }
        }
        stage('artive') {
          steps {
            archiveArtifacts(artifacts: 'build/libs/gocd-1.0.jar', fingerprint: true, onlyIfSuccessful: true)
          }
        }
      }
    }
  }
}