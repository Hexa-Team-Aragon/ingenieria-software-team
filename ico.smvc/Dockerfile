FROM openjdk:17.0-oracle
WORKDIR /app
COPY ./build/libs/ico.smvc-0.0.1-SNAPSHOT.jar /app/apimusic.jar
ENTRYPOINT ["java","-jar","apimusic.jar"]