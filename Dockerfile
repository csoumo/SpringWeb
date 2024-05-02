FROM maven:3.9.6 AS  build
WORKDIR /app
COPY pom.xml /app
RUN mvn depenedency:resolve
COPY . /app
RUN mvn clean
RUN mvn package -DskipTests -X

FROM openjdk:11
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar","app.jar"]
