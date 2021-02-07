# POC Microservices Orchestration

POC for testing microservices orchestration patterns.

### Run:

Checkout this project and install into local repository:

```sh
git clone git@github.com:tentativafc/grpc-spring-boot-starter.git
cd grpc-spring-boot-starter
./gradlew publishToMavenLocal
```

Make projects and run docker compose

```sh
./make.sh
```

### Useful commands:

Force container recreation:

```sh
docker-compose up --build --force-recreate  data-service
```

Stop all containers:

```sh
docker-compose down
docker stop $(docker container  ls -aq)
```

Run Spring Boot like nodemon (nodejs)

```sh
./mvnw spring-boot:run
```

### Services and port numbers:

| Service                         | Port Number | Type/Tech       |
| ------------------------------- | ----------- | --------------- |
| Mysql Data-Service              | 3306        | DB              |
| Mysql Validation-Fields-Service | 3307        | DB              |
| Data-Service                    | 8080        | Spring Boot App |
| Validation-Fields-Service       | 8081        | Spring Boot App |
| Data-Service-RPC                | 9090        | GRPC            |
| Orchestrator-Service            | 8082        | Spring Boot App |
| Service-Discovery               | 8500        | Consul          |
