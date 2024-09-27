/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/**
 *
 * @author USER
 */
public class Arithmetic {
    private int number1;
    private int number2;       

    
    public Arithmetic(int num1, int num2) {
        setNumber1(num1);
        setNumber2(num2);
    }
    
    
    public void setNumber1(int number1){
        this.number1 = (number1 > 0) ? number1 : 0;
    }
    public void setNumber2(int number2){
        this.number2 = (number2 > 0) ? number2 : 0;
    }
    public int getNumber1(){
        return (this.number1);
    }
    public int getNumber2(){
        return (this.number2);
    }
    public int addition(){
        return (getNumber1() + getNumber2());
    }
    public int subtraction(){
        return (getNumber1() - getNumber2());
    }
}
