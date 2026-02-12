# Use a lightweight Java runtime
FROM eclipse-temurin:25-jdk-jammy

# Set working directory
WORKDIR /app

# Copy the built jar into the container
COPY target/user-service-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your service runs on
EXPOSE 8081

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]


