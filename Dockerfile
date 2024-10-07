FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV
COPY ${JAR_FILE} app.jar
COPY config/application.properties /config/application.properties
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}", "-Dspring.config.location=classpath:/,file:/config/application.properties", "-jar", "app.jar"]
