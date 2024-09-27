/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9_2;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:9
ACTIVITY: 2
 */
import java.util.Scanner;
public class Lab9_2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Miles/h" +"\t\t"+ "Km/h");
        kmh();
        }
    
    public static void kmh(){
    double mile, km;
        
        for(mile=60;mile<=130;mile+=10){
            km=mile/0.6214;
            System.out.println(String.format("%.2f", mile)+"\t\t"+String.format("%.3f", km));
}
    }
}