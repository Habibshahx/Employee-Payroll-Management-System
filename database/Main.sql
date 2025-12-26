-- Insert Employees
INSERT INTO Employee (name, email, phone, department, designation, basic_salary, password)
VALUES
('Ali Khan', 'ali@company.com', '03001234567', 'IT', 'Developer', 80000, '12345'),
('Sara Ahmed', 'sara@company.com', '03007654321', 'HR', 'Manager', 90000, '12345');

-- View Employees
SELECT * FROM Employee;

-- Update Employee
UPDATE Employee
SET department = 'Finance', designation = 'Senior Developer'
WHERE employee_id = 1;

-- Delete Employee
DELETE FROM Employee WHERE employee_id = 2;

-- Generate Payroll
INSERT INTO Payroll (employee_id, month, year, bonus, deductions, net_salary, generated_date)
VALUES
(1, 'January', 2025, 5000, 2000, (80000 + 5000 - 2000), CURDATE());

-- View Payroll
SELECT e.name, p.month, p.year, p.net_salary
FROM Employee e
JOIN Payroll p ON e.employee_id = p.employee_id;

-- Employee Login Check
SELECT * FROM Employee
WHERE email = 'ali@company.com' AND password = '12345';
