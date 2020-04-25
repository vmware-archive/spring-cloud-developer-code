FROM adoptopenjdk/openjdk11:jdk-11.0.4_11-alpine-slim
VOLUME /tmp
COPY build/libs/hystrix-dashboard-server-2.1.136.jar hystrix-dashboard-server-2.1.136.jar
ENTRYPOINT ["java","-jar","./hystrix-dashboard-server-2.1.136.jar"]