pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World行行行"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}