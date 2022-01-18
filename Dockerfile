FROM openjdk:17-oracle
COPY build/libs/aims-address-parser-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]