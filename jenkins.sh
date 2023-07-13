pipeline {
    agent {
    	docker{
    		image "maven:3.9.3-jdk-20"
    		label "docker"
    	}
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn clean install' 
            }
        }
    }
    post {
    	always{
    	cleanWs()
    	}
    	success {
            junit 'target/surefire-reports/**/*.xml' 
		    mail to: 'Prasada.kp@outlook.com',
      		subject: "Pipeline has succeeded: ${currentBuild.fullDisplayName}",
      		body: "Successfully completed ${env.BUILD_URL}"
        }
		failure {
    		mail to: 'Prasada.kp@outlook.com',
      		subject: "Pipeline has failed: ${currentBuild.fullDisplayName}",
            body: "Error in ${env.BUILD_URL}"
        }
   }
}