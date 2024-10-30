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
                    sh 'ansible-playbook -i inventory.ini playbook.yml'
                }
            }
        }
	}
}