FROM ubuntu:latest AS build
LABEL authors="oguissouza"

RUN apt-get update
RUN apt-get install openjdk-21-jdk -y

COPY .. .
RUN apt-get install maven -y
RUN mvn clean install

FROM amazoncorretto:21-jdk-alpine

EXPOSE 8080

COPY --from=build /target/ProductManager1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]