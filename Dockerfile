# Use the official Eclipse Temurin 8 base image
FROM maven:3.8.1-jdk-8-openj9 As build
COPY . .

RUN mvn clean package -DskipTests

FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD=root

FROM adoptopenjdk:8-jdk-hotspot
COPY --from=build /target/springOrm1-0.0.1-SNAPSHOT.jar springorm.jar
EXPOSE 8080

# Set the working directory
WORKDIR /app
ENTRYPOINT ["java","-jar","springorm.jar"]

