/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 *  ARUN MUGILAN A/L SARGUNAN S63746
 */
public class Exercise3 {
        private int employeeNo;
        private String employeeName;
        private String employeeType;
        private double Salary;
        private int Hour;
        int allowance = 300;
  
    
    public Exercise3 (int no, String name, String type, double salary, int hour){
        setEmployeeNo (no);
        setEmployeeName (name);
        setEmployeeType (type);
        setSalary (salary);
        setHour(hour);
    }
    
    public void setEmployeeNo (int no){
        employeeNo = no;
    }
    
    public int getEmployeeNo (){
        return employeeNo;
    }
    
    public void setEmployeeName (String name){
        employeeName = name;
    }
    public String getEmployeeName (){
        return employeeName;
    }
    
    public void setEmployeeType (String type){
        employeeType = type;
    }
    public String getEmployeeType (){
        return employeeType;
    }
    
    public void setSalary (double salary){
        Salary = salary;
    }
    public double getSalary(){
        return Salary;
    }
    
    public void setHour(int hour){
        Hour  = hour;
    }
    public int getHour(){
        return Hour;
    }
   
    public double calculateEmpSalaryPermanent(){
        double total;
        total = getSalary()+300;
        return total;
    }
     public double calculateEmpSalaryContract(){
        double total;
        total = getHour()*30;
        return total;
    }
   
    public String toString(){
        return String.format("%s : %s (%s)\n%s: %s","Employee", getEmployeeName(), getEmployeeType(), "Social Security Number", getEmployeeNo());
    }
}
