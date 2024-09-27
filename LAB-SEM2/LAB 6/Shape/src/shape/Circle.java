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
public class Circle extends Shape{
    private int radius;
    
    public Circle(String ShapeName, int radius){
        super(ShapeName);
        setRadius(radius);
    }
    
    public int getRadius(){
        return (this.radius);
    }
    
    public void setRadius(int radius){
        this.radius=radius;
    }
    
    public double calculateArea(){
        return((float) (3.14 * getRadius() * getRadius()));
    }
    
    public String toString(){
        return String.format("%s\n%s %.2f\n",
                super.toString(), "Area of Circle    = ", calculateArea());
    }
    
}
