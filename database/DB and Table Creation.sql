CREATE DATABASE EmployeePayrollDB;
USE EmployeePayrollDB;

-- Employee Table
CREATE TABLE Employee (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(20),
    department VARCHAR(50),
    designation VARCHAR(50),
    basic_salary DECIMAL(10,2) NOT NULL,
    password VARCHAR(100) NOT NULL
);

-- Payroll Table
CREATE TABLE Payroll (
    payroll_id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT NOT NULL,
    month VARCHAR(20),
    year INT,
    bonus DECIMAL(10,2) DEFAULT 0,
    deductions DECIMAL(10,2) DEFAULT 0,
    net_salary DECIMAL(10,2),
    generated_date DATE
);
