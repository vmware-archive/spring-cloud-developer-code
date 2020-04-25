FROM adoptopenjdk/openjdk11:jdk-11.0.4_11-alpine-slim
VOLUME /tmp
COPY build/libs/eureka-server-2.1.136.jar eureka-server-2.1.136.jar
ENTRYPOINT ["java","-jar","./eureka-server-2.1.136.jar"]