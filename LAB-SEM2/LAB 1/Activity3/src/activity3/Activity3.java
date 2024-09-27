/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

/**
 *
 * @author USER
 */
public class Activity3 {

    
    public static void main(String[] args) {
       int length = 4;
       int width = 2;
       System.out.println(" The perimeter is : "+ Perimeter(length,width)+ "cm");
       System.out.println(" The area is : "+ Area(length,width) + "cm");
       
    }
    
    public static int Perimeter(int length,int width){
        int perimeter = 2*(width+length);
        return perimeter;
    }
    public static int Area (int length, int width){
        int area = length*width;
        return area;
    }
    
}
