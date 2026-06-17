# Build stage
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /home/app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Package stage
FROM eclipse-temurin:21-jre-jammy
VOLUME /tmp
COPY --from=build /home/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
