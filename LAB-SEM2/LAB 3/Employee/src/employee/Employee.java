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

    
    private String employeeid;
    private String name;
    Date    hiredate ;
    
    public Employee (String employeeid, String name, Date hiredate){
         setEmployeeid(employeeid);
         setName(name);
         setHiredate(hiredate);
     }
     public void setEmployeeid (String employeeid){
         this.employeeid = employeeid;
     }
     public void setName(String name){
         this.name = name;
     }
     public void setHiredate (Date hiredate){
         this.hiredate = hiredate;
     }
     public String getEmployeeid(){
         return (this.employeeid);
     }
     public String getName(){
         return (this.name);
     }
     public Date getHiredate(){
         return (this.hiredate);
     }
    
     public String toString(){
         return String.format("Employee ID: %s, Name: %s, Hired Date: %s",getEmployeeid(),getName(),getHiredate());
     }
    
}
