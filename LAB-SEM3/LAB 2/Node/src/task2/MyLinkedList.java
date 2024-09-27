/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;


public class MyLinkedList {
    
    private Node first;
    private Node last;
    
    public MyLinkedList(){
        first = null ;
        last = null;
    }
   
    public boolean isEmpty(){
        return first == null;
    }
    
    public void addFirst (char e){
       first = new Node(e, first);
    }
    
    public void addLast (char e){
        if(first == null) addFirst(e);
        else{
            Node el = first;
            while(el.next!= null)el = el.next;
            el.next = new Node(e, null);
        }
    }
    
    public Node deleteFirst(){
        Node el =first;
        first = first.next;
        return el;
    }
    
   public Node deleteLast(){
        Node current = first;
        Node previous = last;
        
        if(first.next == null){
            first = null;
            return current;
        }
        else{
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
            return current;
        }
    } 
   
   public void add(int index, char e){
    Node node = new Node();
    node.data1 = e;
    node.next = null;
    
    if(this.first == null){
        if(index != 0){
            return;
        }
        else{
            this.first = node;
        }
    }
    if(first != null && index == 0){
        node.next = this.first;
        this.first = node;
        return;
    }
    
    Node current = this.first;
    Node previous = null;
    int i = 0;
    while(i<index - 1){
        previous = current;
        current = current.next;
        
        if(current == null){
            break;
        }
        i++;
    }
    node.next = current;
    previous.next = node;
   }
   
   public void printList(){
        Node current = first;
        System.out.print("List: \n");
        while(current != null){
            current.printNode();
            current = current.next;
        }
        System.out.println("");
   }
   
   public void reverse(){
       Node pointer = first;
       Node previous = null;
       Node current = null;
       
       while (pointer != null){
        current = pointer;
        pointer = pointer.next;
        
        current.next = previous;
        previous = current;
        first = current;   
       }
   }
    
}
