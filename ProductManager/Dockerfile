
# STAGE 1 - Build
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

# Copia os arquivos do Maven
COPY pom.xml .
COPY src ./src

# Faz o build do projeto
RUN mvn clean package -DskipTests



# STAGE 2 - Runtime

FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# Copia o jar gerado no stage de build
COPY --from=build /app/target/ProductManager1.jar app.jar

# Porta padrão do Spring Boot
EXPOSE 8080

# Variável importante para o Render
ENV PORT=8080

# Comando de inicialização
ENTRYPOINT ["java", "-jar", "app.jar"]