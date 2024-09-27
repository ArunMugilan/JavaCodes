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
public class Bicycle extends Vehicle{
    int wheels = 2;
    int pedals = 2;
    
    public Bicycle(String name){
        super(name);
    }
    
    void go (){
        System.out.println("This vehicle is moving very slow.");
    }
}
