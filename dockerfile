FROM openjdk:17-jdk
WORKDIR /app

# Copy the JAR file from the target directory to /app inside the container
COPY target/scientific_calc-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

# Run the Java application
CMD ["java", "-cp", "app.jar", "com.iiitb.Main"]
