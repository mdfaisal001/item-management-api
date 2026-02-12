<h1 align="center">🚀 Item Management REST API</h1>

<p align="center">
A simple and clean Spring Boot REST API built with layered architecture.
</p>

---

## 📌 Overview

This project is a backend REST API built using Spring Boot.  
It allows users to:

- ➕ Add new items
- 🔍 Retrieve item by ID
- 📋 Retrieve all items

Data is stored in-memory using an ArrayList.

---

## 🛠 Tech Stack

| Technology | Purpose |
|------------|----------|
| Java 17 | Programming Language |
| Spring Boot | Backend Framework |
| Maven | Build Tool |
| REST API | API Design |
| Jakarta Validation | Input Validation |

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

## ▶️ How to Run

### Clone the repository

```
git clone (https://github.com/mdfaisal001/item-management-api.git)
cd itemapi
```

### Run the application

**Windows**
```
.\mvnw spring-boot:run
```

**Mac/Linux**
```
./mvnw spring-boot:run
```

Application runs at:

```
http://localhost:8080
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

## 🧠 Design Decisions

- Used constructor-based dependency injection
- Separated concerns into Controller, Service, and Model layers
- Implemented input validation using Jakarta Validation
- Used in-memory storage for simplicity (as per task requirement)

---

## 🚀 Future Enhancements

- Add Database (PostgreSQL / MySQL)
- Implement Repository Layer (Spring Data JPA)
- Add DTO pattern
- Implement Global Exception Handling
- Add Unit Testing
- Add Docker support
- Add JWT Authentication

---

## 👨‍💻 Author

Backend assessment project built using Spring Boot.
