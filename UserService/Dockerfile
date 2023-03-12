FROM openjdk:17
EXPOSE 8020
LABEL maintainer="maxx1996"
ADD target/user-service-snapshot.jar user-service-snapshot.jar
ENTRYPOINT ["java", "-jar", "/user-service-snapshot.jar"]