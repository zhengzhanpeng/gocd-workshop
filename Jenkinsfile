pipeline {
    agent any
    stages {
        stage('Test') {
            agent { docker 'openjdk:8-jre' }
            steps {
                sh './gradlew clean test'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
    }
}