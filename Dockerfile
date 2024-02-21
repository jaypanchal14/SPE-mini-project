FROM openjdk:17
EXPOSE 8080
ADD target/spe-mini-project.jar spe-mini-project.jar
ENTRYPOINT ["java","-jar","/spe-mini-project.jar"]