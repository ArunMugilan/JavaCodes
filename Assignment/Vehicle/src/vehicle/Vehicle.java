/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author USER
 */
public class Vehicle {
    double speed;
    String name;
    
    public Vehicle(){
        System.out.println("This is vehicle constructor");
    }
    
    public Vehicle (String name){
        this.name=name;
        System.out.println("This is the second constructor " +
                "and  it has name of the vehicle");
    }
    void go(){
        System.out.println("This vehicle is moving");
    }
    
    void stop(){
        System.out.println("This vehicle is stopped");
    }
    
}
