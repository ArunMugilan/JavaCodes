/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act1;

public class NodeAct1 {

    public int data1;
    public double data2;
    NodeAct1 next;
    
    public NodeAct1 (int d1, double d2){
        data1 = d1;
        data2 = d2;
        next = null;
    }
    
    public void printNode(){
        System.out.println("{"+ data1+","+data2+"}");
    }
    
}
