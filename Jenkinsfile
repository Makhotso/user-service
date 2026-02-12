pipeline {
    agent any

    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image...'
                bat 'docker build -t user-service .'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                // bat 'run your test command here'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // bat 'docker run ...'
            }
        }
    }
}
