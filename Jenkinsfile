pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}