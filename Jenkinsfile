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
        stage('xxx') {
          steps {
            archiveArtifacts(artifacts: 'build/libs/gocd-1.0.jar', fingerprint: true, onlyIfSuccessful: true)
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