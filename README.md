# gestion6_Query

A simple Spring Boot application using H2 database to manage client data with CRUD operations and custom queries.

## Technologies

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Lombok

## Project Structure

com.gestion
├── controller → REST controllers
├── service → Business logic
├── repos → Data access layer (JPA repositories)
├── entities → JPA entities

pgsql
Copier
Modifier

## Configuration

**application.properties**
```properties
spring.datasource.url=jdbc:h2:file:C:/data/testdb9;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
Ensure the folder C:/data exists before running the application.

Features
Add, update, delete, and retrieve clients

Search clients by city (native query)

Search clients by name (JPQL)

How to Run
Clone the repository.

Open in STS or any IDE.

Run as Spring Boot Application.

Access H2 Console: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:file:C:/data/testdb9

User: sa, Password: (leave empty)

API Endpoints
POST /clients – Add a client

GET /clients – Get all clients

GET /clients/{id} – Get client by ID

DELETE /clients/{id} – Delete client by ID

GET /clients/ville/{ville} – Search clients by city

GET /clients/name/{name} – Search clients by name
