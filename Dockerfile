# Stage 1: Build JAR
FROM maven:3.9.2-amazoncorretto-17 AS build
WORKDIR /app

# Copy Maven config and source
COPY pom.xml .
COPY src ./src

# Build JAR (skip tests if you want faster builds)
RUN mvn clean package -DskipTests

# Stage 2: Run app
FROM amazoncorretto:17
WORKDIR /app

# Copy JAR from build stage
COPY --from=build /app/target/Coursework-0.1.0.2.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
