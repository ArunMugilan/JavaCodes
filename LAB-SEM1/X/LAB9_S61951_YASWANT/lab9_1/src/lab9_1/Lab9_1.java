/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9_1;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:9
ACTIVITY: 1
 */
public class Lab9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] sales = {20000.30,15008.90,12584.10,87543.00,28791.30};
        double []ceil =new double [5];
        double []floor =new double [5];
        double []sr =new double [5];
        double []rad =new double [5];
        int x;
  
    for (x = 0; x<sales.length; x++){
        ceil[x] = Math.ceil(sales[x]);
        floor[x] = Math.floor(sales[x]);
        sr[x] = Math.sqrt(sales[x]);
        rad[x] = Math.toRadians(sales[x]);
    }
    
    System.out.println("Sales"+ "\t\t" + "Ceil" + "\t\t" + "Floor" + "\t\t" + "SquareRoot" + "\t\t" + "\t\t" + "Radian");
    for (x = 0; x<sales.length; x++){
        
    System.out.printf(sales[x] +"\t\t"+ceil[x] +"\t\t"+floor[x] +"\t\t"+sr[x] +"\t\t"+rad[x]+ "\n"  );
    }
    }
    
    
}
