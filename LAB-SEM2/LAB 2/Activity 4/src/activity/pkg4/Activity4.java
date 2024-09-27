/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// ARUN MUGILAN A/L SARGUNAN S63746 //

package activity.pkg4;

public class Activity4 {

    private String num1, num2;
    private int No1;
    private double No2;
    
    public Activity4 (String num1, String num2){
        try{
        int a=Integer.parseInt(num1); 
            No1=a;
            }  
        catch(NumberFormatException n1){  
            No1=0;
            }
         
          try{  
            int b=(int) Double.parseDouble(num2);
            No2=b;
            }  
        catch(NumberFormatException n2){
            No2=0;
            } 
          setNo1(No1);
          setNo2((int) No2); 
    }
    public int getNo1(){
        return (this.No1);
    }
    
    public void setNo1(int No1){
        this.No1 = No1;   
    }
    
     public double getNo2(){
        return (this.No2);
    }
     
    public void setNo2(int No2){
        this.No2 = No2;   
    }
    
    public void getResult(){
        if (No1==0){
          System.out.println("The first number entered is incorrect");  
          System.out.println("First number:  "+No1);
        }
        else{
           System.out.println("First number:  "+No1); 
        }
        
        if (No2==0){
          System.out.println("The second number entered is incorrect");  
          System.out.println("Second number:  "+No2);
        }
        else{
           System.out.println("Second number:  "+No2); 
        }
    }
}
    