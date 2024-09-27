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
public class TestClass {
    public static void main (String [] args){
       Car car = new Car();
       car.go();
       Bicycle bike = new Bicycle("BMX");
       System.out.println("The bicycle name is : " + bike.name);
       bike.go();
       bike.stop();
       System.out.println(car.door);
       System.out.println(bike.pedals);
    }
}
