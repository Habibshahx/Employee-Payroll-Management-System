package EPMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    
    // 1) ADD Employee
    public static void addEmployee(Employee employee) {
        String sql = "INSERT INTO Employee (Name, Gender, JobTitle, Department, BasicSalary, Username, Password) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getGender());
            stmt.setString(3, employee.getJobTitle());
            stmt.setString(4, employee.getDepartment());
            stmt.setDouble(5, employee.getBasicSalary());
            stmt.setString(6, employee.getUsername());
            stmt.setString(7, employee.getPassword());
            
            stmt.executeUpdate();
            System.out.println("Employee added successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 2) UPDATE Employee
    public static void updateEmployee(Employee employee) {
        String sql = "UPDATE Employee "
                   + "SET Name = ?, Gender = ?, JobTitle = ?, Department = ?, BasicSalary = ?, Username = ?, Password = ? "
                   + "WHERE EmployeeID = ?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getGender());
            stmt.setString(3, employee.getJobTitle());
            stmt.setString(4, employee.getDepartment());
            stmt.setDouble(5, employee.getBasicSalary());
            stmt.setString(6, employee.getUsername());
            stmt.setString(7, employee.getPassword());
            stmt.setInt(8, employee.getEmployeeID());
            
            stmt.executeUpdate();
            System.out.println("Employee updated successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 3) DELETE Employee
    public static boolean deleteEmployee(int employeeID) {
    String sql = "DELETE FROM Employee WHERE EmployeeID = ?";
    boolean deleted = false;  // tracks whether the deletion was successful
    
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
         
        stmt.setInt(1, employeeID);
        int rowsAffected = stmt.executeUpdate(); 
        // rowsAffected is the number of rows deleted
        
        if (rowsAffected > 0) {
            deleted = true;  // an employee record was actually deleted
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("No employee found with ID: " + employeeID);
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return deleted;
}


    // 4) GET Employee by ID
    public Employee getEmployeeById(int employeeID) {
        Employee employee = null;
        String sql = "SELECT * FROM Employee WHERE EmployeeID = ?";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, employeeID);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                employee = new Employee();
                employee.setEmployeeID(rs.getInt("EmployeeID"));
                employee.setName(rs.getString("Name"));
                employee.setGender(rs.getString("Gender"));
                employee.setJobTitle(rs.getString("JobTitle"));
                employee.setDepartment(rs.getString("Department"));
                employee.setBasicSalary(rs.getDouble("BasicSalary"));
                employee.setUsername(rs.getString("Username"));
                employee.setPassword(rs.getString("Password"));
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    // 5) GET ALL Employees
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM Employee";
        
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setEmployeeID(rs.getInt("EmployeeID"));
                employee.setName(rs.getString("Name"));
                employee.setGender(rs.getString("Gender"));
                employee.setJobTitle(rs.getString("JobTitle"));
                employee.setDepartment(rs.getString("Department"));
                employee.setBasicSalary(rs.getDouble("BasicSalary"));
                employee.setUsername(rs.getString("Username"));
                employee.setPassword(rs.getString("Password"));
                
                employees.add(employee);
            }
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
    public static boolean updateCredentials(int employeeID, String newUsername, String newPassword) {
    String sql = "UPDATE Employee SET Username = ?, Password = ? WHERE EmployeeID = ?";
    boolean success = false;

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
         
        stmt.setString(1, newUsername);
        stmt.setString(2, newPassword);
        stmt.setInt(3, employeeID);

        int rowsAffected = stmt.executeUpdate();
        
        if (rowsAffected > 0) {
            success = true;
        } else {
            System.out.println("No record found with EmployeeID: " + employeeID);
        }

    } catch (SQLException e) {
        System.out.println("SQL Exception: " + e.getMessage());
        e.printStackTrace();
    }

    return success;
}

}
