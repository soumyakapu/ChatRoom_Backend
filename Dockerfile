FROM openjdk:17
COPY target/ChatRoom-0.0.1-SNAPSHOT.jar ChatRoom.jar
ENTRYPOINT ["java", "-jar","/ChatRoom.jar"]