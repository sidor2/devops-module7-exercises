# Use the OpenJDK image as the base image
FROM amazoncorretto:17.0.8

# Copy your JAR file into the image
COPY ./build/libs/bootcamp-docker-java-mysql-project-1.0-SNAPSHOT.jar .

# Expose port 8080
EXPOSE 8080

## Set the command to run your application
CMD ["java", "-jar", "bootcamp-docker-java-mysql-project-1.0-SNAPSHOT.jar"]
