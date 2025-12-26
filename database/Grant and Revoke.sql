-- Admin full access
GRANT ALL PRIVILEGES ON EmployeePayrollDB.* TO 'admin_user';

-- Employee limited access
GRANT SELECT ON EmployeePayrollDB.Employee TO 'employee_user';
GRANT SELECT ON EmployeePayrollDB.Payroll TO 'employee_user';

-- Revoke dangerous permissions
REVOKE DELETE ON EmployeePayrollDB.* FROM 'employee_user';

FLUSH PRIVILEGES;
