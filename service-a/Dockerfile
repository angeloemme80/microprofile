FROM openjdk:8-jdk
ENV KEYSTORE_REQUIRED "false"
#USER root
COPY target/microprofile.jar microprofile.jar
EXPOSE 9080
#EXPOSE 9443
#USER 1001
CMD ["java", "-jar", "microprofile.jar"]
