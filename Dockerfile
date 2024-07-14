FROM openjdk:17
EXPOSE 8080
ADD target/docker-ebank.jar docker-ebank.jar
ENTRYPOINT ["java", "-jar", "/docker-ebank.jar"]
