/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package treeexperiment;

/**
 *
 * @author PC 48
 */
public class DoubleTypeTreeDemo {
    public static void main(String[] args) {
        Node<String> root = new Node<>("root");
        
        Node<String> node1 = root.addChild(new Node<String>("1.0"));
        
        Node<String> node11 = node1.addChild(new Node<String>("1.1"));
        Node<String> node111 = node11.addChild(new Node<String>("1.11"));
        Node<String> node112 = node11.addChild(new Node<String>("1.12"));
        Node<String> node1121 = node112.addChild(new Node<String>("1.121"));
        Node<String> node1122 = node112.addChild(new Node<String>("1.122"));
        
        Node<String> node12 = node1.addChild(new Node<String>("1.2"));
        Node<String> node121 = node12.addChild(new Node<String>("1.21"));
        Node<String> node122 = node12.addChild(new Node<String>("1.22"));
        Node<String> node1211 = node121.addChild(new Node<String>("1.211"));
        Node<String> node12111 = node1211.addChild(new Node<String>("1.2111"));
        Node<String> node12112 = node1211.addChild(new Node<String>("1.2112"));
        
        root.printTree(root, " ");
    }
}

