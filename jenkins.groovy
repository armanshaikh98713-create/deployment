pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main', url: 'https://github.com/armanshaikh98713-create/university-website.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Build Stage'
            }
        }
    }
}