/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
public class Rectangle {

    private double height;
    private double width;
    double area;
    
    public Rectangle (double height, double length){
        setHeight(height);
        setWidth(length);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public String toString(){
         return String.format("Height: %s\nLength: %s\nArea: %s", getHeight(), getWidth(), area());
    }
    
    private double area(){
        area = width*height;
        return (this.area);
    }

    
    
    
}
