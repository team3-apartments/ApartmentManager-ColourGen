FROM maven:latest as maven-build
WORKDIR /build
COPY . .
RUN mvn clean package
FROM java:8
WORKDIR /opt/website/
EXPOSE 8084
COPY --from=maven-build /build/target/ApartmentManager-ColourGen-0.0.1-SNAPSHOT.jar colourgen.jar
ENTRYPOINT ["java", "-jar", "colourgen.jar"]
