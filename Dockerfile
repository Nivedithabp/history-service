FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/history-service-0.0.1-SNAPSHOT.jar history-service.jar
ENTRYPOINT ["java", "-jar", "history-service.jar"]