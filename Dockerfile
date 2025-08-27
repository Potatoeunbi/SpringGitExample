FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/SpringGitExample.jar /app/SpringGitExample.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/SpringGitExample.jar"]