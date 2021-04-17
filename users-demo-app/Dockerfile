FROM openjdk:11

EXPOSE 8082

ARG JAR_FILE=target/users-demo-app.jar

ADD ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]