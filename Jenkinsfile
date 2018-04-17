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
            mvn deploy:deploy-file -DgeneratePom=false -DrepositoryId=nexus -Durl=http://localhost:8080/nexus/content/repositories/releases -DpomFile=pom.xml -Dfile=target/*.jar
      }
    }
        stage('notify') {
            steps {
                echo 'Notification....'
            }
        }
    }
}
