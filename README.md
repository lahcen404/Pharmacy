
---

# 💊 Pharmacy Product Management API

This project is a **RESTful API** built with **Spring Boot** to manage pharmacy products. 
It allows the pharmacy founder to efficiently manage inventory by adding, editing, deleting,
and viewing products in a MySQL database.

---

## 📌 Table of Contents

* [📖 Project Overview](#-project-overview)
* [🚀 Features](#-features)
* [🛠️ Tech Stack](#️-tech-stack)
* [📂 API Endpoints](#-api-endpoints)
* [⚙️ Installation & Run](#️-installation--run)
* [🧪 Testing the API](#-testing-the-api)
* [📚 Resources](#-resources)

---

## 📖 Project Overview

As part of the opening of a new pharmacy in the neighborhood, the founder needs a tool to manage stock and optimize product organization.
This REST API simplifies inventory control and saves time in product management.

---

## 🚀 Features

* **Add a new product** with fields: name, quantity, price, and description (ID auto-generated).
* **Edit existing product** details such as quantity and price.
* **Delete obsolete or unnecessary products** from the inventory.
* **View the complete list** of all available products in the database.

---

## 🛠️ Tech Stack

* **Language:** Java
* **Framework:** Spring Boot
* **ORM:** Hibernate + Spring Data JPA
* **Database:** MySQL 
* **Testing Tool:** Postman
* **Version Control:** Git
* **Data Format:** JSON
* **Build Tool:** Maven 

---

## 📂 API Endpoints

| Method | Endpoint             | Description                 |
| ------ | -------------------- | --------------------------- |
| POST   | `/api/products`      | Add a new product           |
| GET    | `/api/products`      | View all products           |
| GET    | `/api/products/{id}` | View a single product by ID |
| PUT    | `/api/products/{id}` | Edit product details        |
| DELETE | `/api/products/{id}` | Delete a product            |

---
## [Postman Link](https://postman.co/workspace/My-Workspace~49aab289-6de5-487b-8f91-58ce1aacf8db/collection/41299916-08bc485b-578d-472c-b064-85346b2cafb1?action=share&creator=41299916) 
## 🧑‍💻 Author

**Lahcen Ait Maskour**
