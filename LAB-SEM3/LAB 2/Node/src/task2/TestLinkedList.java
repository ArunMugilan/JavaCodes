/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;


public class TestLinkedList {
    
    public static void main (String[]arg){
        MyLinkedList element = new MyLinkedList();
        element.addFirst('a');
        element.addFirst('b');
        element.addFirst('c');
        element.addFirst('d');
        element.addFirst('e');
        
        System.out.println("1. All elements in the list: ");
        element.printList();
        System.out.println("");

        System.out.println("2. Current elements in the list: ");
        element.deleteLast();
        element.printList();
        System.out.println("");
        
        System.out.println("3. Add f at the second place of the list: ");
        element.add(2, 'f');
        element.printList();       
        System.out.println("");
        
        System.out.println("4. Add g at the last place of the list: ");
        element.add(6,'g');
        element.printList();       
        System.out.println("");
       
        System.out.println("5. Current list after delete the first elements: ");
        element.deleteFirst();
        element.printList();
        System.out.println("");
       
        System.out.println("6. Reversed of the list: ");
        element.reverse();
        element.printList();


        
    } 
    
}
