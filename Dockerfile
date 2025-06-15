# 1. Етап білду
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Спочатку копіюємо POM, щоб використати кеш при залежностях
COPY pom.xml .

# Завантажуємо залежності (опціонально)
RUN mvn dependency:go-offline

# Копіюємо решту коду
COPY src ./src

# Білдимо jar
RUN mvn clean package -DskipTests

# 2. Етап рантайму
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]