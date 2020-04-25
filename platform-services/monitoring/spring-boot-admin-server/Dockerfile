FROM adoptopenjdk/openjdk11:jdk-11.0.4_11-alpine-slim
VOLUME /tmp
COPY build/libs/spring-boot-admin-server-2.1.136.jar spring-boot-admin-server-2.1.136.jar
ENTRYPOINT ["java","-jar","./spring-boot-admin-server-2.1.136.jar"]