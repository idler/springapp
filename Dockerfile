FROM tomcat:8.0.20-jre8
COPY /target/web-0.0.1.war  /usr/local/tomcat/webapps/
COPY server.xml /usr/local/tomcat/conf/server.xml
