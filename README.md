# Cafe Management System

Welcome to the Cafe Management System! This application allows users to order products, view categories, see products from different categories, and download bills. This project is built using Spring Boot and provides a comprehensive solution for managing a cafe.

## Features

- **User Registration and Login:** Users can register and log in to their accounts.
- **View Categories:** Users can view different product categories.
- **View Products:** Users can view products under specific categories.
- **Order Products:** Users can place orders for products.
- **Download Bill:** Users can download their bills after placing an order.

## Technologies Used

- **Backend:** Spring Boot, Spring Data JPA, Hibernate
- **Database:** MySQL
- **Frontend:** Thymeleaf (or any frontend framework/library)
- **Build Tool:** Maven
- **Other Libraries:** Lombok for reducing boilerplate code

## Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher
- MySQL database

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/your-username/cafe-management-system.git
    ```
   
2. **Navigate to the project directory:**
    ```bash
    cd cafe-management-system
    ```

3. **Set up the MySQL database:**
    - Create a database named `cafe_management`.
    - Update the `application.properties` file with your MySQL database credentials.

4. **Build the project:**
    ```bash
    mvn clean install
    ```

5. **Run the application:**
    ```bash
    mvn spring-boot:run
    ```

6. **Access the application:**
    Open your web browser and navigate to `http://localhost:8080`.

## Configuration

Configure the following properties in `src/main/resources/application.properties`:

```properties
# MySQL database configurations
spring.datasource.url=jdbc:mysql://localhost:3306/cafe_management
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate configurations
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

7. **Contact Us:**
   ```Email: abhinavsingh021094@gmail.com
