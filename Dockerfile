FROM adoptopenjdk/openjdk8
COPY target/ /tempfolder
WORKDIR /tempfolder
CMD java -jar demo-0.0.1-SNAPSHOT.jar