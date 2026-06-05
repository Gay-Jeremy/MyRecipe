FROM eclipse-temurin:25-jre 

RUN apt-get update && apt-get install -y wget
 
WORKDIR /app

COPY target/MyRecipeAPI-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
