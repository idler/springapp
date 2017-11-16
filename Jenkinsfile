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
         
           def cont = app.run('-p8080:8080 -d --name tomcat');
         echo 'sleeping while catalina starting'
         sh 'sleep 25'
         sh 'curl -i http://localhost:8080/'
         cont.stop()
         cont.rm()
     }
  }
