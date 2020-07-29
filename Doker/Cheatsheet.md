docker image list

docker image rm ID_IMAGEN

up: crea contenedores y los arranca
down : para contenedores y los borra
start: los arranca si estan creados
stop: los para si estan arrancados

#Ejecutar comandos dentro de un contenedor
docker exe CONTENEDOR COMANDO
docker exec -it CONTENEDOR COMANDO

#Copiar archivos entre contenedor y host
docker cp ORIGEN DESTINO

docker exec -it mitomcat bash