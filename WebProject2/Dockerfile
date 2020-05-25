FROM ubuntu:latest
FROM souviksarkar9/java-jre-mvn-git-img 
LABEL maintainer = "Souvik Sarkar souviksarkar9@gmail.com.com"
LABEL creationdate="25th May 2020"
RUN apt-get update 
WORKDIR /usr/local/bin/
COPY ./target/WebProject-0.0.1-SNAPSHOT.jar webrroject2.jar 
CMD ["java" , "-jar" , "webrroject2.jar"]