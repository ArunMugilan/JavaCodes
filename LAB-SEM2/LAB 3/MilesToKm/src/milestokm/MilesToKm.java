/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milestokm;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
public class MilesToKm {

    private double miles;
    double km;
    
    public MilesToKm (double miles){
      setMiles(miles);  
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
    
    public double km() {
        double km = miles * 1.609344;
        return km;
        
    }
    
    
    
}
