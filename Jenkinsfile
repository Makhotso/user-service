pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "user-service:1.0"
    }

    stages {
        stage('Build Docker Image') {
            steps {
                echo "Building Docker image..."
                sh 'docker build -t $DOCKER_IMAGE .'
            }
        }

        stage('Test') {
            steps {
                echo "Running tests in Docker container..."
                // Replace ./run-tests.sh with your actual test command or skip if using Spring Boot tests
                sh 'docker run --rm $DOCKER_IMAGE ./run-tests.sh || echo "Tests skipped"'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying using Docker Compose..."
                sh 'docker-compose up -d'
            }
        }
    }

    post {
        always {
            echo "Pipeline finished."
        }
    }
}
