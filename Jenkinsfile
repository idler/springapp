node {
def app
dir ("build"){
  deleteDir()
  }
  
 stage ('git') {
        checkout scm
 }
  
  stage ('build'){
    def mvn = tool 'maven'
    sh "${mvn}/bin/mvn clean package"
  }
    
    
  stage ('Docker'){
         app = docker.build("spring:${env.BUILD_NUMBER}")
         
           def container = app.run('-p8080:8080 -d --name tomcat');
         sh 'curl -i http://localhost:8080/'
     }
  }
