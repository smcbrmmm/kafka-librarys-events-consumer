# kafka-librarys-events-consumer

Command to run .jar file same consumer but other port for check rebalancing of parition in topics

1. mvn clean package - for build a .jar file in target/
2. java -jar -Dserver.port=[port] target/[filename.jar]
