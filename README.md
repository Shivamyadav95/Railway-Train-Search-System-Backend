# Railway Train Search System - Backend

## Overview

Railway Train Search System Backend is a RESTful web application developed using Spring Boot and MySQL. The application provides APIs for managing train information and searching trains between stations. It follows a layered architecture to ensure clean, maintainable, and scalable code.

---

## Features

- Train search functionality
- RESTful API development
- Spring Boot architecture
- MySQL database integration
- Spring Data JPA and Hibernate
- Layered architecture (Controller, Service, Repository)
- Exception handling
- DTO-based data transfer
- CRUD operations for train management

---

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- REST API

---

## Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── config
```

### Layers

#### Controller Layer
Handles incoming HTTP requests and returns API responses.

#### Service Layer
Contains business logic and application processing.

#### Repository Layer
Interacts with the MySQL database using JPA repositories.

#### Entity Layer
Represents database tables as Java classes.

#### DTO Layer
Used for transferring data between client and server.

#### Exception Layer
Provides centralized exception handling.

---

## API Endpoints

### Train APIs

| Method | Endpoint | Description |
|----------|------------|-------------|
| GET | /api/trains | Get all trains |
| GET | /api/trains/{id} | Get train by ID |
| POST | /api/trains | Add new train |
| PUT | /api/trains/{id} | Update train |
| DELETE | /api/trains/{id} | Delete train |

### Search APIs

| Method | Endpoint | Description |
|----------|------------|-------------|
| GET | /api/search | Search trains between stations |

> Update the endpoints above according to your actual controller mappings.

---

## Database

The application uses MySQL database to store:

- Train Details
- Source Station Information
- Destination Station Information
- Route Information

---

## Prerequisites

Before running the project, make sure you have installed:

- Java 21 or later
- Maven
- MySQL Server
- IntelliJ IDEA / Eclipse (Optional)

---

## Configuration

Update your database credentials in:

```properties
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/railway_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Run Locally

### Clone Repository

```bash
git clone https://github.com/Shivamyadav95/Railway-Train-Search-System-Backend.git
```

### Navigate to Project

```bash
cd Railway-Train-Search-System-Backend
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

Application will start on:

```text
http://localhost:8080
```

---

## Future Enhancements

- User Authentication and Authorization
- Ticket Booking Module
- Seat Availability Checking
- Live Train Status Tracking
- Admin Dashboard
- Passenger Management System

---

## Author

### Shivam Yadav

B.Tech (Computer Science & Engineering)

GitHub:
https://github.com/Shivamyadav95

---

## License

This project is created for learning and educational purposes.
