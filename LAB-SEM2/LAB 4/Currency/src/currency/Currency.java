/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */

public class Currency {

    private double myr;
    double str;
    
    public Currency (double myr){
        setMyr(myr);
    }
    
    public void setMyr (double myr){
        this.myr = myr;
    }
    
    public double getMyr(){
        return (this.myr);
    }
    
    double sterling(){
        double str = myr/4.320;
        str= (str/0.01)*0.01;
        return (str);
    }
}

