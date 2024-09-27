/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1;


public class LinkList {
    private NodeAct1 first;
    public LinkList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void addFirst(int d1, double d2){
        NodeAct1 node = new NodeAct1 (d1, d2);
        node.next = first;
        first = node ;
    }
    
    public NodeAct1 deleteFirst(){
        NodeAct1 temp =first;
        first = first.next;
        return temp;
    }
    
    public void printList(){
        NodeAct1 currentNode = first;
        System.out.print("List: \n");
        while(currentNode != null){
            currentNode.printNode();
            currentNode = currentNode.next;
        }
        System.out.println("");
    }
    
}
