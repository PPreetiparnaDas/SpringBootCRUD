# 📘 Employee Management System

## 🚀 Project Overview

The **Employee Management System** is a Spring Boot application designed to efficiently manage employees and books. This project follows a **layered architecture**, utilizing **Spring Boot, Hibernate (JPA), and MySQL** to provide seamless database interaction and API functionalities.

---

## ✨ Features

✅ CRUD operations for Employees 👨‍💼📂\
✅ CRUD operations for Books 📚\
✅ Layered architecture (Controller, Service, Repository)\
✅ Uses **Spring Data JPA** for easy database interactions\
✅ **Lombok** for reducing boilerplate code\
✅ REST API Endpoints for seamless client interaction\
✅ **Spring Boot DevTools** for faster development and hot reload\
✅ **MySQL Database Integration** 🔗

---

## 🏗 Project Structure

```
EmployeeManagement/
│── src/
│   ├── main/java/com/otz/
│   │   ├── controller/          # Controller Layer
│   │   │   ├── BookController.java
│   │   │   ├── EmployeeController.java
│   │   │   ├── HomeController.java
│   │   ├── entity/              # Entity Layer
│   │   │   ├── Book.java
│   │   │   ├── Employee.java
│   │   ├── repository/          # Repository Layer
│   │   │   ├── BookRepo.java
│   │   │   ├── EmployeeRepo.java
│   │   ├── service/             # Service Layer
│   │   │   ├── BookService.java
│   │   │   ├── BookServiceIMPL.java
│   │   │   ├── EmployeeService.java
│   │   │   ├── EmployeeServiceIMPL.java
│   ├── main/resources/
│   │   ├── application.properties # Configurations
│   ├── test/java/                # Unit Testing
```

---

## 🛠 Technologies Used

| Technology        | Description                   |
| ----------------- | ----------------------------- |
| **Spring Boot**   | Backend framework for Java    |
| **Hibernate JPA** | ORM for database operations   |
| **MySQL**         | Relational Database           |
| **Lombok**        | Reduces boilerplate Java code |
| **Maven**         | Dependency management         |
| **Java 17**       | Programming Language          |

---

## ⚙️ Setup and Installation

### Prerequisites 🛠

- **Java 17+** installed
- **Maven** installed
- **MySQL Database** configured
- **IDE** (IntelliJ IDEA / Eclipse / VS Code)

### Installation Steps 🚀

1️⃣ **Clone the repository:**

```bash
 git clone https://github.com/your-repo-url.git
```

2️⃣ **Navigate to the project directory:**

```bash
 cd EmployeeManagement
```

3️⃣ **Configure the MySQL Database in ****`application.properties`**:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employeedb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

4️⃣ **Build and run the project:**

```bash
mvn spring-boot:run
```

✅ The application will start at **[http://localhost:8080](http://localhost:8080)** 🎉

---

## 📌 API Endpoints

### **Employee APIs** 👨‍💼

| HTTP Method | Endpoint          | Description        |
| ----------- | ----------------- | ------------------ |
| `GET`       | `/employees`      | Get all employees  |
| `GET`       | `/employees/{id}` | Get employee by ID |
| `POST`      | `/employees`      | Add new employee   |
| `PUT`       | `/employees/{id}` | Update employee    |
| `DELETE`    | `/employees/{id}` | Delete employee    |

### **Book APIs** 📚

| HTTP Method | Endpoint      | Description    |
| ----------- | ------------- | -------------- |
| `GET`       | `/books`      | Get all books  |
| `GET`       | `/books/{id}` | Get book by ID |
| `POST`      | `/books`      | Add new book   |
| `PUT`       | `/books/{id}` | Update book    |
| `DELETE`    | `/books/{id}` | Delete book    |

---

## 📝 Author

👩‍💻 **Preetiparna Das**\
Spring Boot Developer 🚀

💬 **Connect with me:**\

🔗 GitHub: [PPreetiparnaDas](https://github.com/PPreetiparnaDas)


