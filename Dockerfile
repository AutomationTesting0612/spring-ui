# Use the official Eclipse Temurin 8 base image

FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_DATABASE=company
ENV MYSQL_USER=root
ENV MYSQL_PASSWORD=root
EXPOSE 3306

RUN docker build -t my-mysql-image .
RUN docker run -d --name my-mysql-container -p 3306:3306 my-mysql-image


FROM maven:3.8.1-jdk-8-openj9 As build
COPY . .

RUN mvn clean package -DskipTests

FROM adoptopenjdk:8-jdk-hotspot
COPY --from=build /target/springOrm1-0.0.1-SNAPSHOT.jar springorm.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springorm.jar"]

