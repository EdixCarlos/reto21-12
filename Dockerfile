FROM openjdk:17-slim

WORKDIR /app

COPY target/reto-0.0.1-SNAPSHOT.jar /app/reto.jar

ENTRYPOINT ["java", "-jar", "/app/reto.jar"]
