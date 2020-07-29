#MAVEN
#Creacion de un nuevo proyecto Java basado en una 
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart

#Identificar proyecto maven
- groupId --> Empresa / organizacion a cargo del desarrollo (Dominio invertido), ejm com.gfi
-           Que estoy desarrollando (a alto nivel), ejm web-app-nominas
-           Lo adjuntamos mediante un punto, ejm: con.gfi.web-app-nominascom
- artifactId --> Que es nuestro proyecto?, ejm: web service
El identificador del proyecto es groupId + artifactId

mvn GOLE_NAME
- mvn-clean --> limpiar compilaciones anteriores
- mvn compile --> compilar el proyecto
- mvn test-compile
- mvn test
- mvn package --> empaquetar proyecto