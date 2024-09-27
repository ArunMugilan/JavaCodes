/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10_act3;


/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:10
ACTIVITY:3
 */
import java.io.*;
import java.util.*;
public class Lab10_act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNextLine()) {
            String word = inputFile.next();
            System.out.println(word);
        }
        inputFile.close();
    }

}
