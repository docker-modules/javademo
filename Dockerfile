openjdk:8-alpine
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN javac Main.java
CMD ["java", "Main"]