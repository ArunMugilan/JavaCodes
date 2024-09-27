/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author USER
 */
public class Fan {

    static private int PERLAHAN=1, SEDERHANA=2, LAJU=3;
    private int speed=SEDERHANA;
    private boolean on = false;
    private double radius=5;
    private String colour = "biru";
    
    public Fan (int SPD, boolean ON, double RD, String CLR){
        speed = SPD;
        on = ON;
        radius =RD;
        colour = CLR;
    }
    
    public void setspeed(int speed){
        this.speed = speed;
    }
    public int getspeed (){
        return (this.speed);
    }   
    
    public boolean on(){
        return on;
    }
    public void turnOn(){
       on = true; 
    }
    public void turnOff(){
       on = false; 
    }
    
    public void setradius(double radius){
        this.radius = radius;
    }
    public double getradius (){
        return (this.radius);
    }
    
    public void setcolour(String colour){
        this.colour = colour;
    }
    public String getcolour (){
        return (this.colour);
    }
    
    public String toString(){
        String output = "Speed"+getspeed()+"\n"+"Colour"+getcolour()+"\n"+"Radius"+getradius()+"\n";
        if(on())
          output = "Speed: "+getspeed()+"\n"+"Colour: "+getcolour()+"\n"+"Radius: "+getradius();  
        else
          output = "Colour: "+getcolour()+"\n"+"Radius: "+getradius()+"\n"+"Fan is off";
        return output;
        }
    
}
