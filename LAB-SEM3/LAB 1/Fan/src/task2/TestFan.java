/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;


public class TestFan {
     public static void main(String[] args) {
       Fan F1 = new Fan (3, false, 10, "Merah");
       System.out.println(F1.toString());
       Fan F2 = new Fan (2, true, 5, "Biru");
       System.out.println("\n\n"+F2.toString());
     }
    
}
