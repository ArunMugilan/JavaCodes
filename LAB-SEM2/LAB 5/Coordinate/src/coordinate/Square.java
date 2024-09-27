/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinate;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
public class Square extends Shape{
    public Square (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        super(x1,y1,x2,y2,x3,y3,x4,y4);
    }
    
    public void squareArea(){
        System.out.println(super.toString());
        System.out.printf("Area of Square = %.1f\n", super.calculateArea());
    }
}
