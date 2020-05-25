#FROM ubuntu:latest
FROM tomcat:latest
#FROM souviksarkar9/java-jre-mvn-git-img 

LABEL maintainer = "Souvik Sarkar souviksarkar9@gmail.com.com"
LABEL creationdate="25th May 2020"

#RUN apt-get update 
#WORKDIR /usr/local/bin/

EXPOSE 8080
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/WebProject-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh" , "run"]