FROM openjdk:21-jdk-slim
EXPOSE 8080
ADD target/hello.jar hello.jar
ENTRYPOINT ["java","-jar","/hello.jar"]