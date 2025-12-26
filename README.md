# Employee Payroll Management System (Java + Database)

## 📌 Introduction
The **Employee Payroll Management System** is a Java-based desktop application integrated with a relational database using **JDBC**.  
The system is designed to manage employee records, generate payroll, and securely store payroll information.

This project demonstrates practical implementation of **Java Swing**, **SQL**, and **database connectivity** as part of an academic semester project.

---

## 🎯 Objectives
- Manage employee records efficiently
- Generate and store payroll information
- Perform CRUD operations using SQL
- Integrate Java application with database using JDBC
- Implement database security using authorization and privileges

---

## 🛠 Technologies Used
- **Programming Language:** Java  
- **UI Framework:** Java Swing (NetBeans Forms)  
- **Database:** MySQL 
- **Connectivity:** JDBC  
- **Query Language:** SQL  

---

## ✨ System Features
- Admin login
- Add, update, view, and delete employees
- Generate employee payroll
- View payroll details (Admin & Employee)
- Employee profile management
- Secure database access using roles and privileges

---

## 📂 Project Structure
Employee-Payroll-Management-System/
├── src/
│ ├── ui/
│ ├── model/
│ ├── dao/
│ ├── config/
│ ├── Admin.java
│ └── Main.java
│
├── database/
│ ├── DB and Table Creation.sql
│ ├── relation.sql
│ ├── Main.sql
│ ├── authorization.sql
│ └── Grant and Revoke.sql
│
├── report/
│ └── Employee Payroll Management System Documentation.pdf
│
├── README.md
└── .gitignore

---

## ▶ How to Run the Project

### 1️⃣ Database Setup
Run the SQL files in the following order:
1. `DB and Table Creation.sql`
2. `relation.sql`
3. `Main.sql`
4. `authorization.sql`
5. `Grant and Revoke.sql`

---

### 2️⃣ Java Application
1. Open the project in **NetBeans / IntelliJ / Eclipse**
2. Configure database credentials in `DBConnection.java`
3. Run `Main.java` or `Admin.java`

---

## 📊 Database Description
- **Employee Table:** Stores employee details
- **Payroll Table:** Stores payroll records
- **Relationship:** One employee can have multiple payroll records

---

## 🔐 Security
- Admin users have full database access
- Employees have limited read-only access
- Privileges are managed using **Grant** and **Revoke**

---

## 🎓 Academic Information
- **Project Type:** Semester Project  
- **Course:** Database Systems / Object Oriented Programming  
- **Institution:** COMSATS University Islamabad  
- **Campus:** Abbottabad  

---

## 👤 Author
**Habib Shah**  
BS Software Engineering  

---

## ✅ Conclusion
The Employee Payroll Management System successfully integrates Java and SQL to provide a secure and efficient payroll solution.  
This project demonstrates strong understanding of database design, backend integration, and real-world system development.

