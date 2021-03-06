FROM openjdk:8-jdk
ADD target/microprofile.jar microprofile.jar
USER 1001
EXPOSE 9080
CMD ["java", "-jar", "microprofile.jar"]
