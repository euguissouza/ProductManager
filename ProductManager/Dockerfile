FROM ubuntu:latest
LABEL authors="oguissouza"

RUN apt-get uptade
RUN apt-get install openjdk-21-jdk -y
COPY .. .
RUN apt-get install maven -y
RUN mvn clean install


ENTRYPOINT ["top", "-b"]