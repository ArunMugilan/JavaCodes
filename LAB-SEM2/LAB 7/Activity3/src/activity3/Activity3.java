/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 * 
 */
public class Activity3 {
    private int number1;
    private int number2;
    
    public Activity3 ( int num1, int num2){
        number1 = num1; 
        number2 = num2; 
    }
    
        
    public void setnumber1(int num1){
        this.number1 = num1;
    }
    
    public int getnumber1(){
        return (this.number1);
    }

    public void setnumber2(int num2){
        this.number2 = num2;
    }
    public int getnumber2(){
        return (this.number2);
    }
    
    public double divider(){
        return getnumber1() / getnumber2();
    }
}

