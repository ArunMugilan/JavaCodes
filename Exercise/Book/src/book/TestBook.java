/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author USER
 */
public class TestBook {
    public static void main (String [] args){
        System.out.println("Paper Book Details");
        System.out.println("------------------");
        PrintBook PB1 = new PrintBook("Absolute Java", 2017, "Arun", "Mugilan", "B123XXXX-XXXX");
        System.out.println(PB1+ "\n");
        System.out.println("Audio Book Details");
        System.out.println("------------------");
        AudioBook AB1 = new AudioBook ("Absolute Java", 2017,"Deitel", 15, 10," Mugilan");
        System.out.println(AB1);
    }
    
}
