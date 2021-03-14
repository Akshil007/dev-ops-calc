FROM openjdk:8
COPY ./target/calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","calculator-1.0-SNAPSHOT-jar-with-dependencies.jar","calc"]