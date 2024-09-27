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
public class ShapeTest {
    public static void main (String[] args){
        Square mysquare = new Square (0,0, 0,2, 2,2, 2,0);
        mysquare.squareArea();
        
        System.out.println(" ");
        
        Rectangle myrectangle = new Rectangle (0,0, 0,2, 5,2, 5,0);
        myrectangle.rectangleArea();
    }
}
