pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean package'  # Adjust for Windows cmd as needed
                }
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    docker.build('your-dockerhub-username/your-java-webapp:latest')
                }
            }
        }
        stage('Docker Login') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', 'dockerhub-credentials-id') {
                        // Docker login successful
                    }
                }
            }
        }
        stage('Docker Push') {
            steps {
                script {
                    docker.withRegistry('https://index.docker.io/v1/', 'dockerhub-credentials-id') {
                        docker.image('your-dockerhub-username/your-java-webapp:latest').push('latest')
                    }
                }
            }
        }
    }
}
