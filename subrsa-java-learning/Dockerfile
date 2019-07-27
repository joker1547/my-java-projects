FROM openjdk:8-jdk-alpine

EXPOSE 8081

VOLUME /tmp

ARG JAR_FILE

RUN ls -ltr ./

COPY target/subrsa-java-learning-0.0.1-SNAPSHOT.jar app.jar

RUN ls -ltr app.jar

ENTRYPOINT ["java", "-jar","/app.jar"]
