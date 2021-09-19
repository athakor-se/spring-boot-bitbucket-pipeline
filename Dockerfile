FROM openjdk:11
WORKDIR /app
ARG JAR_FILE=target/spring-boot-pipeline-demo.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]