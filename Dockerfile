FROM openjdk:17
EXPOSE 8080
COPY target/google-kubernetes-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "./google-kubernetes-0.0.1-SNAPSHOT.jar"]