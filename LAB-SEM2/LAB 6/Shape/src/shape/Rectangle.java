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
public class Rectangle extends Shape{
    private int width;
    private int length;
    
    public Rectangle(String ShapeName, int width, int length){
        super(ShapeName);
        setLength(length);
        setWidth(width);
    }
    
    public int getWidth(){
        return (this.width);
    }
    
    public void setWidth(int width){
        this.width=width;
    }
    
    public int getLength(){
        return (this.length);
    }
    
    public void setLength(int length){
        this.length=length;
    }
    
    public double calculateArea(){
        return((float) (getWidth() * getLength()));
    }
    
    public String toString(){
        return String.format("%s\n%s %.2f\n",
                super.toString(), "Area of Rectangle    = ", calculateArea());
    }
}
