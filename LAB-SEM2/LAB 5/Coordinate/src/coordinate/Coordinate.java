/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordinate;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN
 */

public class Coordinate {
    private double x;
    private double y;
    
    public Coordinate(double xCoordinate, double yCoordinate){
        x= xCoordinate;
        y=yCoordinate;
    }
    
    public double getX(){
        return (this.x);
    }
    
    public void setX(double x){
        this.x=x;
    }
    
    public double getY(){
        return (this.y);
    }
    
    public void setY(double Y){
        this.y=y;
    }
    
    public String toString(){
        return String.format("(%.1f, %.1f)", getX(), getY());
    }
    
}
