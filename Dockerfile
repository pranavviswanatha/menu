# Use a Maven image with Eclipse Temurin JDK 17 for building the project
FROM maven:3.8.7-eclipse-temurin-17 AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy the source code to the container
COPY . .

# Build the project with Maven
RUN mvn clean package -DskipTests

# Use a lightweight OpenJDK image to run the built JAR
FROM eclipse-temurin:17-jre-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/app.jar app.jar

# Expose the port the app will run on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
