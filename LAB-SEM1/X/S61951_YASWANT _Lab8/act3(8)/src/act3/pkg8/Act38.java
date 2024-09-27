/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act3.pkg8;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:8
ACTIVITY: 3
 */
public class Act38 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        double[] alpha = new double[50];

        for (int i = 0; i < 50; i++) {
            if (i < 25) 
            {
             alpha[i] = i* i;
            } 
            else 
            {
             alpha[i] = i* i* i;
            }
            System.out.printf("%.2f" , alpha[i]);
            if (i%10 == 0) 
                System.out.println();
            
        }
    }
}
