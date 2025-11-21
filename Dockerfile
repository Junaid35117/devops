FROM amazoncorretto:17

# Copy the new release jar
COPY ./target/seMethods-0.1.0.2.jar /tmp/app.jar

WORKDIR /tmp
#dfohfioj

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
