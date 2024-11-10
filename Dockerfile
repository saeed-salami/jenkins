FROM maven:3.8.6-openjdk-11-slim AS build

WORKDIR /app

COPY mvnw pom.xml ./

COPY .mvn ./.mvn

RUN ./mvnw clean package -DskipTests

COPY src ./src

FROM openjdk:11-jre-slim

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080