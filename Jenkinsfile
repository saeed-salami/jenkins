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
                    bat 'java -jar target/testforjenkings-0.0.1-SNAPSHOT.jar'
                }
            }
        }
    }
}