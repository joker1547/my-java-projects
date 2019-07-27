FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /my-java-projects/subrsa-java-learning/target/subrsa-java-learning-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch subrsa-java-learning-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java", "-jar", "subrsa-java-learning-0.0.1-SNAPSHOT.jar"]