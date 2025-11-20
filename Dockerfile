FROM amazoncorretto:17

# Copy the new release jar
COPY ./target/Coursework-0.1.0.2.jar /tmp/app.jar

WORKDIR /tmp

ENTRYPOINT ["java", "-jar", "app.jar"]
