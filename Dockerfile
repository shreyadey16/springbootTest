FROM openjdk:8-jdk-alpine
EXPOSE 8080
COPY target/*.war /opt/app.jar
WORKDIR /opt
CMD ["java", "-jar", "app.jar"]
