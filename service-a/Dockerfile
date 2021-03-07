FROM openjdk:8-jdk
ENV KEYSTORE_REQUIRED "false"
USER root
ADD target/microprofile.jar microprofile.jar
EXPOSE 9080
USER 1001
CMD ["java", "-jar", "microprofile.jar"]
