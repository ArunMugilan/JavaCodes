/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinate;

/**
 *
 * Arun Mugilan A/L Sargunan s63746
 */
public class Shape {
    
    private Coordinate point1;
    private Coordinate point2;
    private Coordinate point3;
    private Coordinate point4;
    
    public Shape (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        point1 = new Coordinate(x1,y1);
        point2 = new Coordinate(x2,y2);
        point3 = new Coordinate(x3,y3);
        point4 = new Coordinate(x4,y4);
    }
    
    public Coordinate getPoint1(){
        return(this.point1);
    }
    
    public void setPoint1(Coordinate point1){
        this.point1=point1;
    }
    
    public Coordinate getPoint2(){
        return(this.point2);
    }
    
    public void setPoint2(Coordinate point2){
        this.point2=point2;
    }
    
    public Coordinate getPoint3(){
        return(this.point3);
    }
    
    public void setPoint3(Coordinate point3){
        this.point3=point3;
    }
    
    public Coordinate getPoint4(){
        return(this.point4);
    }
    
    public void setPoint4(Coordinate point4){
        this.point4=point4;
    }
    
    public double getHeight(){
        return Math.abs(getPoint2().getY()-getPoint1().getY());
    }
    
    public double getWidth(){
        return Math.abs(getPoint4().getX() - getPoint2().getX());
    }
    
    public double calculateArea(){
        return (getWidth()*getHeight());
    }
    
    public String toString(){
        return String.format("%s:\n%s","Coordinate of Shape", getCoordinateAsString());
    }
    
    public String getCoordinateAsString(){
        return String.format("%s, %s, %s, %s\n", point1, point2, point3, point4);
    }
}
