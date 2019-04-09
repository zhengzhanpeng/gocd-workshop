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
        stage('get') {
          steps {
            archiveArtifacts 'build/libs/gocd-1.0.jar'
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
  post {
    always {
      junit 'build/reports/tests/test/index.html'

    }

  }
}