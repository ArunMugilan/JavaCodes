/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
public class Employee {

    private int employeeNo;
    private String employeeName;
    private String employeeType;
    private double Salary;
    private int Hour;
    int allowance = 300;
  
    
    public Employee (int no, String name, String type, double salary, int hour){
        setEmployeeNo (no);
        setEmployeeName (name);
        setEmployeeType (type);
        setSalary (salary);
        setHour (hour);
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public int getHour() {
        return Hour;
    }

    public void setHour(int Hour) {
        this.Hour = Hour;
    }
    
   
    public double calculatePermanent(){
        double total;
        total = getSalary() + allowance;
        return total;
    }
    
    public double calculateContract(){
        double total;
        total = getHour()*30;
        return total;
    }
    
    public String toString(){
        return String.format("%s : %s (%s)\n%s: %s","Employee", getEmployeeName(), getEmployeeType(), "Social Security Number", getEmployeeNo());
    }
    
}
