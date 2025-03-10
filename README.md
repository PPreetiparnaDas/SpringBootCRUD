# SpringBootCRUD
This is a Spring Boot-based Employee Management System that provides functionalities to manage employees and books. It follows a layered architecture using Spring Boot, Hibernate (JPA), and MySQL.

🏗 Project Structure
The project is structured into different packages:

📂 com.otz.controller (Controller Layer)
BookController.java: Manages CRUD operations for books.
EmployeeController.java: Manages CRUD operations for employees.
HomeController.java: Handles home page requests.
📂 com.otz.entity (Entity Layer)
Book.java: Represents the Book entity.
Employee.java: Represents the Employee entity.
📂 com.otz.repasatory (Repository Layer)
BookRepo.java: Repository interface for Book entity (extends JpaRepository).
EmployeeRepo.java: Repository interface for Employee entity (extends JpaRepository).
📂 com.otz.service (Service Layer)
BookService.java: Service interface for books.
BookServiceIMPL.java: Implementation of BookService.
EmployeeService.java: Service interface for employees.
EmployeeServiceIMPL.java: Implementation of EmployeeService.
📂 src/main/resources
application.properties: Configuration file for database connection and Hibernate settings.
🛠 Technologies Used
Backend: Spring Boot, Hibernate (JPA)
Database: MySQL
Java Version: Java 17
Maven Dependencies: Spring Boot, Lombok, JPA, MySQL Connector
📝 README.md File
Here is the README.md file content:

md
Copy
Edit
# Employee Management System

## 📌 Project Description
The **Employee Management System** is a Spring Boot application designed to manage employees and books. It uses **Spring Boot, Hibernate, JPA, and MySQL** for backend development.

## 🚀 Features
- CRUD operations for Employees
- CRUD operations for Books
- Layered architecture (Controller, Service, Repository)
- Uses Spring Data JPA for database interactions
- Lombok for reducing boilerplate code

## 🏗 Project Structure
src/ │── main/java/com/otz/ │ ├── controller/ │ │ ├── BookController.java │ │ ├── EmployeeController.java │ │ ├── HomeController.java │ ├── entity/ │ │ ├── Book.java │ │ ├── Employee.java │ ├── repasatory/ │ │ ├── BookRepo.java │ │ ├── EmployeeRepo.java │ ├── service/ │ │ ├── BookService.java │ │ ├── BookServiceIMPL.java │ │ ├── EmployeeService.java │ │ ├── EmployeeServiceIMPL.java │── main/resources/ │ ├── application.properties │── test/java/

markdown
Copy
Edit

## 🛠 Technologies Used
- **Spring Boot** (Backend framework)
- **Hibernate JPA** (ORM for database operations)
- **MySQL** (Relational Database)
- **Lombok** (For reducing boilerplate code)
- **Maven** (Dependency Management)
- **Java 17** (Programming Language)

## ⚙️ Setup and Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo-url.git
Open the project in your favorite IDE (Eclipse/IntelliJ)
Configure the MySQL Database in application.properties
Run the Spring Boot application:
bash
Copy
Edit
mvn spring-boot:run
The application will start on http://localhost:8080
📌 API Endpoints
Employee APIs
HTTP Method	Endpoint	Description
GET	/employees	Get all employees
GET	/employees/{id}	Get employee by ID
POST	/employees	Add new employee
PUT	/employees/{id}	Update employee
DELETE	/employees/{id}	Delete employee
Book APIs
HTTP Method	Endpoint	Description
GET	/books	Get all books
GET	/books/{id}	Get book by ID
POST	/books	Add new book
PUT	/books/{id}	Update book
DELETE	/books/{id}	Delete book
