pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main', url: 'https://github.com/armanshaikh98713-create/demo6.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Build Stage'
    
        }
    
    }
    stage('sending codet'){
        steps{
            sshagent(['deplyment']){
                sh "scp -o StrictKeyChecking=no *ubuntu@13.234.35.251:/tmp" 
            }
    }}
}
}