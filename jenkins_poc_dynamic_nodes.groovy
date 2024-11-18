pipeline {
    agent { label 'poc-jenkins' }
    
    stages {
        stage('Validation') {
            steps {
                script {
                    ssh-keyscan github.com github.com >> '/home/dynamicnodes/.ssh/known_hosts'
                    ssh-keygen -F github.com -f '/home/dynamicnodes/.ssh/known_hosts' # verifies key is correctly installed
                    ssh -T git@github.com
                }
            }
        }
    }
}
