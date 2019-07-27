#To Execute subrsa-java-learning from command line as a jar
java -jar subrsa-java-learning/target/subrsa-java-learning-0.0.1-SNAPSHOT.jar

#DOCKER
- maven-dependency plugin in the module unpacks the fat.jar in target folder into dependency dirs.
- so that the docker file is configured to look for this.
- But there pom based docker plugins available  and tuorial for it is found in
		 https://spring.io/guides/gs/spring-boot-docker/
- we add docker plugin another day.