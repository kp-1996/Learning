pipeline {
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
		sh 'man clean build'
            }
        }
    }
}