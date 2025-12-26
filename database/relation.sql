ALTER TABLE Payroll
ADD CONSTRAINT fk_payroll_employee
FOREIGN KEY (employee_id)
REFERENCES Employee(employee_id)
ON DELETE CASCADE;
