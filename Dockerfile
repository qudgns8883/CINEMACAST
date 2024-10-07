FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/*.jar
ARG PROFILES
ARG ENV
COPY config/application.properties /app/application.properties
COPY ${JAR_FILE} app.jar
RUN ls -l /app && cat /app/application.properties
ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}", "-jar", "app.jar"]