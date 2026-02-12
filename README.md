<h1 align="center">🚀 Item Management REST API</h1>

<p align="center">
A clean and production-ready Spring Boot REST API built using layered architecture.
</p>

<p align="center">
🌍 <strong>Live Demo:</strong>  
https://item-management-api-eid8.onrender.com
</p>

---

## 📌 Overview

This project is a backend REST API built using Spring Boot.

It allows users to:

- ➕ Add new items
- 🔍 Retrieve item by ID
- 📋 Retrieve all items

Data is currently stored in-memory using an `ArrayList`.

The application is containerized with Docker and deployed on Render.

---

## 🛠 Tech Stack

| Technology | Purpose |
|------------|----------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Maven | Build Tool |
| REST API | API Design |
| Jakarta Validation | Input Validation |
| Docker | Containerization |
| Render | Cloud Deployment |

---

## 🏗 Project Architecture

This project follows a layered architecture:

```
Controller  →  Service  →  Model
```

### Structure

```
com.faisal.itemapi
│
├── controller
│   └── ItemController.java
│
├── service
│   └── ItemService.java
│
├── model
│   └── Item.java
│
└── ItemapiApplication.java
```

---

## 🌍 Live API

Base URL:

```
https://item-management-api-eid8.onrender.com
```

Example:

```
GET https://item-management-api-eid8.onrender.com/api/items
```

---

## ▶️ Run Locally

### Clone the repository

```bash
git clone https://github.com/mdfaisal001/item-management-api.git
cd item-management-api
```

### Run the application

**Windows**
```bash
.\mvnw spring-boot:run
```

**Mac/Linux**
```bash
./mvnw spring-boot:run
```

Application runs at:

```
http://localhost:8080
```

---

## 🐳 Run Using Docker

Build the image:

```bash
docker build -t itemapi .
```

Run the container:

```bash
docker run -p 8080:8080 itemapi
```

---

## 📡 API Endpoints

### ➕ Add Item

**POST** `/api/items`

Request Body:

```json
{
  "name": "Laptop",
  "description": "Gaming laptop"
}
```

Response:

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming laptop"
}
```

Status: `201 Created`

---

### 🔍 Get Item by ID

**GET** `/api/items/{id}`

Example:

```
GET /api/items/1
```

If not found:

```
404 Not Found
```

---

### 📋 Get All Items

**GET** `/api/items`

Response:

```json
[
  {
    "id": 1,
    "name": "Laptop",
    "description": "Gaming laptop"
  }
]
```

---

## ✅ Validation

- `name` cannot be blank
- `description` cannot be blank

Returns:

```
400 Bad Request
```

Example:

```json
{
  "name": "Name is required",
  "description": "Description is required"
}
```

---

## ❗ Error Handling

- 404 → Item not found
- 400 → Validation failure

---

## 🚀 Deployment

This application is:

- Containerized using Docker
- Built using multi-stage Docker build
- Deployed on Render
- Configured to use dynamic port binding via:

```properties
server.port=${PORT:8080}
```

Free-tier instances may spin down due to inactivity.

---

## 🧠 Design Decisions

- Constructor-based dependency injection
- Layered architecture for separation of concerns
- Validation using Jakarta Validation
- In-memory storage for simplicity
- Cloud-ready configuration

---

## 🚀 Future Enhancements

- Add Database (PostgreSQL / MySQL)
- Implement Repository Layer (Spring Data JPA)
- Add DTO pattern
- Implement Global Exception Handling
- Add Unit Testing
- Add JWT Authentication
- Add Swagger/OpenAPI documentation

---

## 👨‍💻 Author

Mohammed Faisal  
Backend Developer | Java | Spring Boot
