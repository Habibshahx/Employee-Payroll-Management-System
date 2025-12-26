/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPMS;
import java.util.Date;
/**
 *
 * @author Habib
 */
public class Payroll {
    private int payrollID;
    private int employeeID;
    private double bonuses;
    private double deductions;
    private double netSalary;
    private Date paymentDate;

    // Constructors
    public Payroll() {
    }

    public Payroll(int payrollID, int employeeID, double bonuses, double deductions, 
                   double netSalary, Date paymentDate) {
        this.payrollID = payrollID;
        this.employeeID = employeeID;
        this.bonuses = bonuses;
        this.deductions = deductions;
        this.netSalary = netSalary;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public int getPayrollID() {
        return payrollID;
    }

    public void setPayrollID(int payrollID) {
        this.payrollID = payrollID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getBonuses() {
        return bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}


