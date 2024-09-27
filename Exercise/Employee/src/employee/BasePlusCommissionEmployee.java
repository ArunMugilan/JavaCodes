/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author USER
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary; 

   
   public BasePlusCommissionEmployee( String first, String last, String ssn, double sales, double rate, double salary ){
      super( first, last, ssn, sales, rate );
      setBaseSalary( salary ); 
   } 

   
   public void setBaseSalary( double salary ){
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary; 
   } 

   
   public double getBaseSalary(){
      return baseSalary;
   } 

   
   public double earnings(){
      return getBaseSalary() + super.earnings();
   }

   
   public String toString(){
      return String.format( "%s %s; %s: $%,.2f", 
         "base-salaried", super.toString(), 
         "base salary", getBaseSalary() );
   } 
}
