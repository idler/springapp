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
    
    
  stage ('test'){
    def docker = tool 'docker'
    sh "${docker}/bin/docker build mywar ."
    
  }
}
