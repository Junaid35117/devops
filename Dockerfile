FROM amazoncorretto:17

# Copy the fat jar into the container
COPY ./target/seMethods-0.1.0.2-jar-with-dependencies.jar /tmp/app.jar

WORKDIR /tmp

# Run the JAR
CMD ["java", "-jar", "app.jar"]
