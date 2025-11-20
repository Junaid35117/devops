# Stage 2: Run app
FROM amazoncorretto:17
WORKDIR /app

# Copy JAR from build stage (use correct file name!)
COPY --from=build /app/target/seMethods-0.1.0.2.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
