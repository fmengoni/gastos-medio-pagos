FROM maven:3.6.3-jdk-8 as builder

WORKDIR /usr

COPY . .

RUN mvn install -DskipTests	

RUN cp /usr/target/gastos-0.0.1-SNAPSHOT.jar /usr/target/gastos-medios-pagos.jar

FROM ibmjava:8-jre

WORKDIR /usr

COPY --from=builder /usr/target/gastos-medios-pagos.jar .

CMD java -jar /usr/gastos-medios-pagos.jar

EXPOSE 8080