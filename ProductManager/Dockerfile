FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY ProductManager/pom.xml .
RUN mvn dependency:go-offline

COPY ProductManager/src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app
EXPOSE 8080

COPY --from=build /app/target/ProductManager1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]