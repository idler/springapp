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
         
           def cont = app.run('-p127.0.0.1:8082:8082 -d --name tomcat');
         echo 'sleeping while catalina starting'
         sh 'sleep 85'
         sh 'curl -i http://127.0.0.1:8082/'
         cont.stop()
     }
  }
