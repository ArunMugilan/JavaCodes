/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9_5;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:9
ACTIVITY: 5
 */
public class Lab9_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
  double tax;
  
  System.out.println("taxable income\t\tsingle\t\tmarried joint\t\tmarried separate\t\thead of a house");
  for(tax = 50000;tax <= 60000;tax += 50)
  {                         
   System.out.println("RM" + Math.round(tax) +"\t\tRM" + Math.round(single(tax)) + "\t\tRM" + Math.round(joined_m(tax)) + "\t\tRM" + Math.round(seperate_m(tax)) + "\t\tRM" + Math.round(house_head(tax)));
  }
 }

 public static double single(double tax){                  
  double odd = tax*17/100;
  return odd;
 }

 public static double joined_m(double tax2){
  double join = tax2*15/100;
  return join; 
 }

 public static double seperate_m(double tax3){                 
  double separate = tax3*18/100; 
  return separate; 
 }

 public static double house_head(double tax4) {                  
  double leader = tax4*16/100;
  return leader; 
 }
}