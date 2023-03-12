FROM openjdk:17
EXPOSE 8040
LABEL maintainer="maxx1996"
ADD target/task-service-snapshot.jar task-service-snapshot.jar
ENTRYPOINT ["java", "-jar", "/task-service-snapshot.jar"]