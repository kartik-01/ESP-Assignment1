FROM openjdk:21-jdk-slim
EXPOSE 8081
ADD target/world.jar world.jar
ENTRYPOINT ["java","-jar","/world.jar"]