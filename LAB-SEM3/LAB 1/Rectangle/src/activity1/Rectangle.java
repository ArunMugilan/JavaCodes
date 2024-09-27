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
public class Rectangle {
    private double height, width;

    public Rectangle(double h, double w) {
        height = h;
        width = w;
    }
    
    public double area(){
        double theArea;
        theArea= height * width;
        return theArea;
    }
    
    public double perimeter(){
        double p;
        p = 2*(height + width);
        return p;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }
    
    
    
    
}
