FROM 533313119160.dkr.ecr.us-west-2.amazonaws.com/alpine-oraclejdk8:2

RUN mkdir -p /etc/narvar /opt/db /var/log/narvar/

COPY web/target/web.jar  /opt/web.jar

EXPOSE 8080
WORKDIR /opt
ENTRYPOINT ["java", "-jar", "web.jar"]
