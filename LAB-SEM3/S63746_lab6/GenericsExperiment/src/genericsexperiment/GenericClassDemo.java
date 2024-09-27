/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericsexperiment;

/**
 *
 * @author PC 48
 */
public class GenericClassDemo {
    public static void main(String[] args) {
        NonGenericClass x=new NonGenericClass("Final", "Exam");
        x.print();
        
        MyGenericClass <String, Integer> mygc=new MyGenericClass <>("Final",2022);
        mygc.print();
    }
    
}
