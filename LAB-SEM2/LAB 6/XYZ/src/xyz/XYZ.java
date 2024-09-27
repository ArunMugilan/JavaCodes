/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
public final class XYZ {
    private String Name;
    private int Magazine;
    public XYZ (String name, int magazine){
        setName(name);
        setMagazine (magazine);
    }
    
    final public String getName(){
        return(this.Name);
    }
    
    final public void setName(String name){
        this.Name=name;
    }
    
    final public int getMagazine(){
        return(this.Magazine);
    } 
    
    final public void setMagazine (int magazine){
        this.Magazine=magazine;
    }
    
    final public double calculateCommission(){
        double result= getMagazine() * 2.5;
        return result;
    }
    
    final public void Output(){
        System.out.println("Name: "+ getName() );
        System.out.println("Number of magazine : "+ getMagazine() );
        System.out.printf("Total commission is : RM"+"%.2f\n", calculateCommission() );
    }
}
