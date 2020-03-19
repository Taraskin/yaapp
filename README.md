# yaapp
Yet another application. This is a simple example of spring-data-jdbc and spring-data-rest running in a Spring Boot app against a PostgreSQL database. Demonstrates that minimalistic CRUD is possible with no application-specific code.

## Status
![Java CI with Maven](https://github.com/svejk-ciber/yaapp/workflows/Java%20CI%20with%20Maven/badge.svg)


## Building
### Maven packaging
```
$ mvn package
```

### Build and publish Docker image with Jib
```
$ mvn jib:build
```

## Running
To run locally you can start a PostgreSQL server and adjust settings accordingly in `application.properties` (or env. variables or system properties).

### Run everything as Docker containers
This assumes you have built and pushed the image with Jib beforehand.

1.  Create a shared Dockernetwork:  
    ```
    $ docker network create --driver bridge mynet
    ```
2. Start a PostgreSQL container:
   ```
   $ docker run --net=mynet -p 5432:5432 --rm  --name yaapp-db -e POSTGRES_PASSWORD=<MY_PG_PASSWORD> -d postgres:0.0.1-SNAPSHOT
   ```
   _NB_: The PostgreSQL password must match what you provide to the app later on.
3. Start the app:
   ```
   $ docker run --net=mynet -p 8080:8080 -e SPRING_DATASOURCE_URL=jdbc:postgresql://yaapp-db:5432/postgres -d yaapp:0.0.1-SNAPSHOT
   ```
   


