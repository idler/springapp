node {
def APP_URL=""
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
     }
  stage ('Test'){
    app.withRun()
  }
}
