# Usar una imagen base de Java 17
FROM eclipse-temurin:17-jdk-alpine

# Instalar Maven
RUN apk add --no-cache maven

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo pom.xml y el código fuente
COPY pom.xml .
COPY src ./src

# Ejecutar Maven para construir el JAR dentro del contenedor
RUN mvn clean package -DskipTests

# Exponer el puerto que Spring Boot usará
EXPOSE 8080

# Comando para ejecutar la aplicación Spring Boot
CMD ["java", "-jar", "target/Intento1-0.0.1-SNAPSHOT.jar"]
