FROM eclipse-temurin:17-jdk-alpine
WORKDIR /opt/demos/javacv
ADD build/distributions/demo-javacv-1.0-SNAPSHOT.tar ${WORKDIR}
#CMD ["chmod", "+x", "/opt/demos/javacv/demo-javacv-1.0-SNAPSHOT/bin/demo-javacv"]
#ENTRYPOINT ["sh", "-c", "/opt/demos/javacv/bin/demo-javacv ${0}"]
ENTRYPOINT ["sh", "-c", "/opt/demos/javacv/demo-javacv-1.0-SNAPSHOT/bin/demo-javacv ${0}"]
#docker run --rm \
#--name=demo-javacv \
#--device /dev/dri:/dev/dri  \
#demo-javacv:dev