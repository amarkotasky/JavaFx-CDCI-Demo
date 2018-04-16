pipeline {
    agent any

    stages {
        stage('Checkout') {
              steps {
                  checkout scm
              }
          }
        stage('Clean') {
            steps {
                sh 'cd ./my-app && mvn clean' 
            }
        }
        stage('Build') {
            steps {
                sh 'cd ./my-app && mvn install' 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
            artifact {
            artifactId('Nexus-Artifacts-Upload')
            type('jar')
            classifier('debug')
            file('./my-app/target/*')
        }
            }
        }
        stage('notify') {
            steps {
                echo 'Notification....'
            }
        }
    }
}
