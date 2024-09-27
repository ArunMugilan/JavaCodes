/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1;

/**
 *
 * @author USER
 */
public class LinkListTest {
    public static void main (String[]arg){
        LinkList list = new LinkList();
        list.addFirst(1, 1.01);
        list.printList();
        list.addFirst(2, 2.02);
        list.printList();
        list.addFirst(3, 3.03);
        list.printList();
        list.addFirst(4, 4.04);
        list.printList();
        list.addFirst(5, 5.05);
        list.printList();
        
        while(!list.isEmpty()){
            NodeAct1 deleteLink = list.deleteFirst();
            System.out.print("Deleted: \n");
            deleteLink.printNode();
            System.out.println("");
        }
        list.printList();
    } 
    
}
