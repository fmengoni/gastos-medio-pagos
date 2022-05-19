BUILD
docker build . -t gastos-medio-pagos

RUN
docker run -dti --network=gastos -p 8081:8080 --name gastos-medio-pagos gastos-medio-pagos