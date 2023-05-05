FROM eclipse-temurin:17

LABEL mentainer="javaguides.net@gmail.com"

WORKDIR /app

COPY target/blog-0.0.2.jar /app/blog-api.jar

ENTRYPOINT ["java", "-jar", "springboot-restful-webservices.jar"]