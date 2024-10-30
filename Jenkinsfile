pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins_maven'
	}

// 	tools {
// 		jdk 'java-11.0.2'
// 	}

	stages {

		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}

		stage('Run Ansible Playbook') {
            steps {
                script {
                    ansiblePlaybook(
                        credentialsId: 'id_rsa', // SSH credentials for access
                        inventory: 'D:/ansible/inventory.ini', // Path to your inventory file
                        playbook: 'D:/ansible/playbook.yml', // Path to your playbook
                        become: true, // Use sudo if required
                        extraVars: [
                            key1: 'value1', // Additional variables if needed
                            key2: 'value2'
                        ]
                    )
                }
            }
        }
	}
}