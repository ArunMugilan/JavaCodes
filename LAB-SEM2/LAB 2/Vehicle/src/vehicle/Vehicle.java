/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// ARUN MUGILAN A/L SARGUNAN S63746 //
package vehicle;

public class Vehicle {
    private String VehicleType;
    private String ChassisNo;
    private int ProductionYear;
    
    public Vehicle(){
      System.out.println("Vehicle Information");  
    }
    
    public Vehicle(String VehicleType, String ChassisNo){
        setVehicleType(VehicleType);
        setChassisNo(ChassisNo);
    }
    
    public Vehicle(String VehicleType, String ChassisNo, int ProductionYear){
        setVehicleType(VehicleType);
        setChassisNo(ChassisNo);
        setProductionYear(ProductionYear);
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    public String getChassisNo() {
        return ChassisNo;
    }

    public void setChassisNo(String ChassisNo) {
        this.ChassisNo = ChassisNo;
    }

    public int getProductionYear() {
        return ProductionYear;
    }

    public void setProductionYear(int ProductionYear) {
        this.ProductionYear = ProductionYear;
    }    
}
    

