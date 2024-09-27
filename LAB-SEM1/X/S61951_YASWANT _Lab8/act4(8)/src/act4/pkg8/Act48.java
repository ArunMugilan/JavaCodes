/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act4.pkg8;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:8
ACTIVITY: 4
 */
public class Act48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mark[][] = {{1, 78, 90, 40, 75}, 
                        {2, 90, 83, 75, 68}, 
                        {3, 40, 80, 53, 69}, 
                        {4, 75, 80, 98, 95}, 
                        {5, 64, 50, 41, 70}};
        
        int i, j;
        int[] total = new int[5];
        System.out.println(" ");
        for (i = 0; i < 5; i++) 
        {
            System.out.println(" Student ID :" + mark[i][0]);
            System.out.println(" Mark 1 :" + mark[i][1]);
            System.out.println(" Mark 2 :" + mark[i][2]);
            System.out.println(" Mark 3 :" + mark[i][3]);
            System.out.println(" Mark 4 :" + mark[i][4]);
            System.out.println(" ");
        }
        for (i = 0; i < 5; i++) 
        {
            for (j = i; j < 5; j++) 
            {
                total[i] += mark[i][j];
            }
        }
        for (j = 0; j < 5; j++) 
        {
            System.out.println(" Student " + mark[j][0] + " total marks is " + total[j]);
        }
    }
}
