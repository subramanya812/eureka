FROM openjdk:latest
EXPOSE 8080
ADD /target/eurekaclien-0.0.1-SNAPSHOT.jar eureka-naming-client-1.0.jar
ENTRYPOINT ["java","jar","eureka-naming-client-1.0.jar"]