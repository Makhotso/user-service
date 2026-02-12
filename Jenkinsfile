pipeline {
    agent any

    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building Java project...'
                // Build project with Maven, skip tests for faster build
                bat 'mvn clean package -DskipTests'
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
                // Add test commands here if needed
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying Docker container...'
                // Stop any existing container
                bat 'docker rm -f user-service || echo No container to remove'
                // Run new container
                bat 'docker run -d -p 8080:8080 --name user-service user-service'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
    }
}

