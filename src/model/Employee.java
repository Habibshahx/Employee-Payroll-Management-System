/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPMS;

/**
 *
 * @author Habib
 */
public class Employee {
    private int employeeID;
    private String name;
    private String gender;
    private String jobTitle;
    private String department;
    private double basicSalary;
    private String username;
    private String password;
    private int NameChangeAllowed;

    // Constructors
    public Employee() {
    }

    public Employee(int employeeID, String name, String gender, String jobTitle, 
                    String department, double basicSalary, String username, String password) {
        this.employeeID = employeeID;
        this.name = name;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.department = department;
        this.basicSalary = basicSalary;
        this.username = username;
        this.password = password;
       
    }

    // Getters and Setters
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


