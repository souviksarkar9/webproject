FROM ubuntu:latest
FROM souviksarkar9/java-jre-mvn-git-img 
LABEL maintainer = "Souvik Sarkar souviksarkar9@gmail.com.com"
LABEL creationdate="25th May 2020"
RUN apt-get update 
COPY ./target/WebProject-0.0.1-SNAPSHOT.jar /usr/local/bin/webproject2.jar 
CMD ["java" , "-jar" , "webproject2.jar"]