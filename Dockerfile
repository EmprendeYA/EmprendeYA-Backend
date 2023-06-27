FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/demo2-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} emprendeya.jar
ENTRYPOINT ["java","-jar","/emprendeya.jar"]