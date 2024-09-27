/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xx;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Xx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[]no = {1, 2, 3, 4, 5};
        String[]name = {"MUHAMMAD", "HASSAN", "ZULKARNAIN", "BAHRUDDIN", "MOHD NOOR"};
        String[]stream = {"SCIENCE", "SCIENCE", "LITERATURE", "SCIENCE", "LITERATURE"};
        double[]CGPA = {3.08, 2.42, 2.42, 2.17, 3.23};
        char[]spmMalay = {'A', 'A', 'B', 'B', 'A'};
        char[]spmMaths = {'A', 'A', 'A', 'B', 'A'};
        char[]spmHistory = {'A', 'A', 'C', 'A', 'A'};
        char[]spmScience = {'B', 'C', 'B', 'A', 'C'};
        char[]stpmGeneralStudies = {'C', 'C', 'B', 'C', 'D'};
        char[]stpmMalay = {'A', 'B', 'C', 'C', 'A'};
        String[]stpmICT = {"A", "A", "NIL", "C", "NIL"};
        String[]stpmMaths = {"B", "D", "NIL", "C", "NIL"};
        int[]muet = {4, 4, 3, 2, 2};
        String print = "";
        String print1 = "";
        
        
        
        for (int i = 0; i < no.length; i++){
            int count = 0;
            
            if (((spmMalay[i] == 'C') || (spmMalay[i] == 'B') || (spmMalay[i] == 'A')) &&
               ((spmHistory[i] == 'E') || (spmHistory[i] == 'D') || (spmHistory[i] == 'C') ||  (spmHistory[i] == 'B') || (spmHistory[i] == 'A')) &&
               (CGPA[i] >= 2.00) &&
               ((stpmGeneralStudies[i] == 'C') || (stpmGeneralStudies[i] == 'B') || (stpmGeneralStudies[i] == 'A')) &&
               (muet[i] >= 1)){
                print = "PASS";
            }
            else {
                print = "NOT PASS";
            }
            
            if ((stpmGeneralStudies[i] == 'C') || (stpmGeneralStudies[i] == 'B') || (stpmGeneralStudies[i] == 'A')){
                count++;    
            }
            
            if ((stpmMalay[i] == 'C') || (stpmMalay[i] == 'B') || (stpmMalay[i] == 'A')){
                count++;    
            }
            
            if ((stpmICT[i].equals("C")) || (stpmICT[i].equals("B")) || (stpmICT[i].equals("A"))){
                count++;    
            }
            
            if ((stpmMaths[i].equals("C")) || (stpmMaths[i].equals("B")) || (stpmMaths[i].equals("A"))){
                count++;    
            }
            
            if (((count >= 2) &&
               ((spmMaths[i] == 'C') || (spmMaths[i] == 'B') || (spmMaths[i] == 'A')) &&
               ((spmScience[i] == 'C') || (spmScience[i] == 'B') || (spmScience[i] == 'A'))) ||
               (((stpmMaths[i].equals("C")) || (stpmMaths[i].equals("B")) || (stpmMaths[i].equals("A"))) && 
               ((stpmICT[i].equals("C")) || (stpmICT[i].equals("B")) || (stpmICT[i].equals("A"))) &&
               (muet[i] >= 2))){
                print1 = "PASS";
            }
            else {
                print1 = "NOT PASS";
            }
            
            System.out.println(no[i] + ". NAME: " + name[i]);
            System.out.println("   GENERIC REQUIREMENT: " + print);
            System.out.println("   SPECIFIC REQUIREMENT: " + print1 + "\n");
            System.out.println("   count: " + count + "\n");
        }
        
    }
    
}
    


    
    

