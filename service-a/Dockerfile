FROM openjdk:8-jdk
ADD target/microprofile.jar microprofile.jar
EXPOSE 9080
USER 1001
CMD ["java", "-jar", "microprofile.jar"]
