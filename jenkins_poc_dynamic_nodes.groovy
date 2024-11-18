pipeline {
    agent { label 'poc-jenkins' }
    
    stages {
        stage('Validation') {
            steps {
                script {
                    echo "I am working"
                }
            }
        }
    }
}
