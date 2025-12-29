# ======================
# STAGE 1 - BUILD
# ======================
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

# Copia apenas arquivos necessários primeiro (cache do Maven)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia o resto do projeto
COPY src ./src

# Build da aplicação
RUN mvn clean package -DskipTests

# ======================
# STAGE 2 - RUNTIME
# ======================
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

EXPOSE 8080

# Copia o JAR gerado no stage de build
COPY --from=build /app/target/ProductManager.jar app.jar

# Executa a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]