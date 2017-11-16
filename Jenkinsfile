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
         app = docker.build("mar:${env.BUILD_NUMBER}")
         
         docker.withRegistry('http://10.142.0.4:80') { 
           app.push("${env.BUILD_NUMBER}")
         }
     }
  }
