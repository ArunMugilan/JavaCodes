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
public class Shape {
    private String ShapeName;
    
    public Shape(String ShapeName){
        setShapeName(ShapeName);
    }
    
    public void setShapeName(String ShapeName){
        this.ShapeName=ShapeName;
    }
    
    public String getShapeName(){
        return(this.ShapeName);
    }
    
    public double calculateArea(){
        return(0.0f);
    }
    
    public String toString(){
        return String.format("%s %s\n,",
                "Shape Name      = ", getShapeName() );
    }
    
}
