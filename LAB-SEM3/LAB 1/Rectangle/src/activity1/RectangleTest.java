/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

/**
 *
 * @author USER
 */
public class RectangleTest {
    
    public static void main (String[] args){
        Rectangle myRect = new Rectangle(12.5, 10);
        double theAreamy = myRect.area();
        double myP = myRect.perimeter();
        System.out.println("My Rectangle has area " + theAreamy);
        System.out.println("My Rectangle has perimeter " + myP);
        System.out.println("Width is " + myRect.getWidth());
        System.out.println("Height is " + myRect.getHeight());
    }
    
}
