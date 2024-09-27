/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericsexperiment;


public class NonGenericClass {
    String obj1;
    String obj2;
    
    NonGenericClass(String obj1, String obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }
    
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
