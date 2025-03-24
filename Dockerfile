FROM openjdk:8
EXPOSE 8080
ADD target/grid-integration.jar grid-integration.jar
ENTRYPOINT ["java","-jar","/grid-integration.jar"]