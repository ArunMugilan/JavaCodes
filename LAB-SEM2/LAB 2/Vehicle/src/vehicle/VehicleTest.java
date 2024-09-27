/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// ARUN MUGILAN A/L SARGUNAN S63746 //

package vehicle;


public class VehicleTest {
    public static void main (String[] args){
        Vehicle obj1Vehicle = new Vehicle();
        Vehicle obj2Vehicle = new Vehicle("Car","C1");
        Vehicle obj3Vehicle = new Vehicle("Bus","B1",2022);
        
        System.out.println("The vehicle type is : "+obj2Vehicle.getVehicleType());
        System.out.println("The vehicle chassis number is : "+obj2Vehicle.getChassisNo());
        System.out.println("");
        System.out.println("The vehicle type is : "+obj3Vehicle.getVehicleType());
        System.out.println("The vehicle chassis number is : "+obj3Vehicle.getChassisNo());
        System.out.println("The production year is : "+obj3Vehicle.getProductionYear());
    }
    
}
