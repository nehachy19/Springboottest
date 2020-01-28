FROM maven:3.5-jdk-8 as BUILD
COPY . /usr/src/app

WORKDIR /usr/src/app
RUN mvn clean install -DskipTests

FROM openjdk:8-jre
COPY --from=BUILD /usr/src/app/target /opt/target
WORKDIR /opt/target

CMD ["java","-jar","HelloWorld-0.0.1-SNAPSHOT.war"]

# mvn -Dmaven.repo.local=./repository clean package
# tar cf repository.tar.gz ./repository