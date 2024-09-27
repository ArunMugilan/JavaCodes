/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10_act5;

/*NAME:YASWANT KUMAHR NAIR A/L VITHIANANTHAN
MATRIC ID:S61951
LAB:10
ACTIVITY:5
 */
import java.io.*;
import java.util.*;
public class Lab10_act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("C:\\Users\\Acer\\Desktop\\lab 10\\lab10_act5");
        Scanner input = new Scanner(file);
        PrintWriter result = new PrintWriter("result.txt");
        
        String[] name = new String[10];
        double[] mark = new double[10];
        char[] grade = new char[10];
        String tempName;
        char tempGrade;
        double total = 0.0, average, tempMark;
        int i = 0;
        
        while(input.hasNext()) {
            name[i] = input.next();
            mark[i] = input.nextDouble();
            grade[i] = input.next().charAt(0);
            i++;
        }
        
        for (int j = 0; j < mark.length; j++) {
            for (int k = j + 0; k < mark.length; k++) {
                if (mark[j] < mark [k]) {
                    tempName = name[j];
                    name[j] = name [k];
                    name[k] = tempName;
                    
                    tempMark = mark[j];
                    mark[j] = mark[k];
                    mark[k] = tempMark;
                    
                    tempGrade = grade[j];
                    grade[j] = grade [k];
                    grade [k] = tempGrade;
                }
            }
        }
        for (int j = 0; j < mark.length; j++) {
            System.out.println((j + 1) + ". " + name[j] + "\t" + mark[j] + "\t" + grade[j]);
        total += mark[j];
        }
        
        average = total / mark.length;
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        
        input.close();
    }
    
}
