#FROM openjdk:8-jdk
FROM redhat-openjdk18-openshift:1.8
ADD target/microprofile.jar microprofile.jar
EXPOSE 9080
CMD ["java", "-jar", "microprofile.jar"]
