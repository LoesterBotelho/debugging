# ==========================================
# Stage 1 - Build
# ==========================================
FROM maven:3.9-eclipse-temurin-25 AS build

WORKDIR /app

# Copia o pom.xml para aproveitar o cache do Docker
COPY pom.xml .

# Baixa as dependências
RUN mvn dependency:go-offline -B

# Copia o código-fonte
COPY src ./src

# Executa os testes e gera o JAR
RUN mvn clean package


# ==========================================
# Stage 2 - Runtime
# ==========================================
FROM eclipse-temurin:25-jre

WORKDIR /app

# Copia o JAR gerado
COPY --from=build /app/target/debugging-1.0.0.jar app.jar

# Executa a aplicação Java
ENTRYPOINT ["java", "-jar", "app.jar"]