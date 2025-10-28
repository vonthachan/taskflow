taskflow/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── voon/
│   │   │           └── taskflow/
│   │   │               ├── TaskFlowApplication.java
│   │   │               ├── entity/
│   │   │               │   ├── User.java
│   │   │               │   ├── Project.java (to be created)
│   │   │               │   └── Task.java (to be created)
│   │   │               ├── repository/
│   │   │               │   ├── UserRepository.java
│   │   │               │   ├── ProjectRepository.java (to be created)
│   │   │               │   └── TaskRepository.java (to be created)
│   │   │               ├── dto/
│   │   │               │   ├── RegisterRequest.java
│   │   │               │   ├── LoginRequest.java
│   │   │               │   ├── AuthResponse.java
│   │   │               │   ├── ProjectRequest.java (to be created)
│   │   │               │   ├── ProjectResponse.java (to be created)
│   │   │               │   ├── TaskRequest.java (to be created)
│   │   │               │   └── TaskResponse.java (to be created)
│   │   │               ├── service/
│   │   │               │   ├── AuthService.java (to be created)
│   │   │               │   ├── ProjectService.java (to be created)
│   │   │               │   └── TaskService.java (to be created)
│   │   │               ├── controller/
│   │   │               │   ├── AuthController.java (to be created)
│   │   │               │   ├── ProjectController.java (to be created)
│   │   │               │   └── TaskController.java (to be created)
│   │   │               ├── security/
│   │   │               │   ├── JwtUtil.java
│   │   │               │   ├── CustomUserDetailsService.java
│   │   │               │   ├── JwtAuthenticationFilter.java (to be created)
│   │   │               │   └── SecurityConfig.java (to be created)
│   │   │               ├── exception/
│   │   │               │   ├── GlobalExceptionHandler.java (to be created)
│   │   │               │   └── ResourceNotFoundException.java (to be created)
│   │   │               └── config/
│   │   │                   └── (additional configs if needed)
│   │   └── resources/
│   │       ├── application.properties
│   │       └── application.properties.example
│   └── test/
│       └── java/
│           └── com/
│               └── voon/
│                   └── taskflow/
│                       └── TaskFlowApplicationTests.java
├── target/ (generated, ignored by git)
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

**Pattern explanation:**
```
Layer Structure:
┌─────────────────────────────────────┐
│         Controller Layer            │  <- REST API endpoints
│  (handles HTTP requests/responses)  │
└──────────────┬──────────────────────┘
│
┌──────────────▼──────────────────────┐
│          Service Layer              │  <- Business logic
│   (processes data, applies rules)   │
└──────────────┬──────────────────────┘
│
┌──────────────▼──────────────────────┐
│        Repository Layer             │  <- Database access
│     (queries and persistence)       │
└──────────────┬──────────────────────┘
│
┌──────────────▼──────────────────────┐
│          Entity Layer               │  <- Database models
│       (tables/data structure)       │
└─────────────────────────────────────┘

Additional layers:
- DTO: Data transfer between layers
- Security: Authentication & authorization
- Exception: Error handling