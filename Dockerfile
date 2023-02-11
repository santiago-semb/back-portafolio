FROM amazoncorretto:17-alpine-jdk

MAINTAINER sansembbb

COPY target/back-portfolio-0.0.1-SNAPSHOT.jar back-portfolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/back-portfolio-0.0.1-SNAPSHOT.jar"]