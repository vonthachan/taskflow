# TaskFlow - Task Management REST API

A Spring Boot REST API for managing projects and tasks with user authentication.

## Features

- User authentication with JWT tokens
- Create and manage projects
- Create tasks with status, priority, and due dates
- Assign tasks to users
- Filter tasks by project, status, and priority
- Secure endpoints with Spring Security

## Tech Stack

- Java 17
- Spring Boot 3.5.7
- Spring Security with JWT
- Spring Data JPA
- PostgreSQL
- Maven

## Setup Instructions

### Prerequisites

- Java 17 or higher
- PostgreSQL
- Maven

### Database Setup

1. Create PostgreSQL database:

```bash
psql postgres
CREATE DATABASE taskflow;
\q
```

2. Configure database in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskflow
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

### Run the Application

```bash
./mvnw spring-boot:run
```

The API will be available at `http://localhost:8080`

## API Endpoints

### Authentication

- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - Login and get JWT token

### Projects (requires authentication)

- `POST /api/projects` - Create project
- `GET /api/projects` - Get all user's projects
- `GET /api/projects/{id}` - Get project by ID
- `PUT /api/projects/{id}` - Update project
- `DELETE /api/projects/{id}` - Delete project

### Tasks (requires authentication)

- `POST /api/tasks` - Create task
- `GET /api/tasks` - Get all tasks
- `GET /api/tasks/{id}` - Get task by ID
- `GET /api/tasks/project/{projectId}` - Get tasks by project
- `PUT /api/tasks/{id}` - Update task
- `DELETE /api/tasks/{id}` - Delete task

## Example Usage

### 1. Register a user

```json
POST /api/auth/register
{
  "username": "john",
  "email": "john@example.com",
  "password": "password123"
}
```

### 2. Create a project

```json
POST /api/projects
Headers: Authorization: Bearer {token}
{
"name": "Website Redesign",
"description": "Redesign company website"
}
```

### 3. Create a task

```json
POST /api/tasks
Headers: Authorization: Bearer {token}
{
"title": "Design homepage mockup",
"description": "Create initial design concepts",
"status": "TODO",
"priority": "HIGH",
"dueDate": "2025-11-30",
"projectId": 1
}
```

## Task Status Options

- `TODO`
- `IN_PROGRESS`
- `COMPLETED`

## Task Priority Options

- `LOW`
- `MEDIUM`
- `HIGH`
- `URGENT`

## Project Structure

```
src/main/java/com/voon/taskflow/
├── entity/          # Database models
├── repository/      # Data access layer
├── dto/             # Data transfer objects
├── service/         # Business logic
├── controller/      # REST endpoints
└── security/        # JWT & security config
```

## Future Enhancements

- Add task comments
- Task filtering by date range
- Email notifications for due dates
- File attachments for tasks
- Team collaboration features