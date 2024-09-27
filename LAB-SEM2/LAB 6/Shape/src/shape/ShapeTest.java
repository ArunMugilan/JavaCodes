/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * ARUNMUGILAN A/L SARGUNAN S63746
 */
public class ShapeTest {
    public static void main(String[] args){
       Circle objCircle = new Circle("Circle", 4);
       Rectangle objRectangle = new Rectangle("Rectangle", 2, 4);
       
       Shape myShape[] = new Shape [2];
       
       myShape[0]= objCircle;
       myShape[1]= objRectangle;
       
       System.out.println("Shape process polymorphically....!");
       System.out.println("");
       
       for (Shape currentShape : myShape){
           if(currentShape instanceof Rectangle){
               Rectangle myRectangle = (Rectangle) currentShape;
               myRectangle.setLength(6);
               System.out.println(myRectangle);
           }
           else{
               System.out.println(currentShape);
           }
       }
    }
}
