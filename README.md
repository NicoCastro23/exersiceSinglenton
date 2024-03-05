# exercise

Niconcio está desarrollando un juego en Java y su objetivo es crear un sistema donde cada usuario pueda acceder al juego de forma eficiente y segura, manteniendo un registro de las puntuaciones más altas. Para lograrlo, necesitan implementar el patrón Singleton para garantizar una única instancia de una clase que maneje el registro de puntuaciones. Además, el juego debe incluir parámetros esenciales, como el nombre del jugador, la puntuación obtenida y cualquier otra información relevante para el funcionamiento del juego.

# Autores

- Juan Nicolas Castro juann.castroh@uqvirtual.edu.co
- Santiago Polania  
- Juan Stevan Acosta

# Herramientas

- [java 17](https://adoptium.net/es)
- [junit 5.10.0](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0)
- [maven](https://maven.apache.org)


# Construcción y pruebas

Para compilar el proyecto puede usar el comando:

```shell
mvn clean compile
```

Para ejecutar las pruebas puede usar el comando: 

```shell
 mvn clean test
```

Para generar el jar puede usar el comando: 

```shell
 mvn clean package
```

y para ejecutar el jar

```shell
 java -jar target/exercise-1.0.jar
```
