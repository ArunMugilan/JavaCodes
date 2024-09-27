/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistqexperiment;

import java.util.Deque;
import java.util.ArrayDeque;
public class dequeDemo {
   public static void main (String[] args){
       Deque<String> deque = new ArrayDeque<String>();
       deque.offer("Struktur");
       deque.offer("Data");
       deque.add("Dan");
       deque.offerFirst("Algoritma");
       System.out.println("After offerFirst Traversal....");
       for (String s : deque ){
            System.out.println(s);
       }
 
       deque.pollLast();
       System.out.println("After pollLast() Traversal....");
       for (String s : deque){
            System.out.println(s);
       }
   } 
}
