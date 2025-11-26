# Use Java 17 base image
FROM amazoncorretto:17

# Set working directory
WORKDIR /tmp

# Copy the fat JAR built by Maven
COPY ./target/seMethods-0.1.0.2-jar-with-dependencies.jar /tmp/app.jar

# Set entrypoint to run the JAR
ENTRYPOINT ["java", "-jar", "/tmp/app.jar"]
