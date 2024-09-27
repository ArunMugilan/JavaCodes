/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act5;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import java.util.Scanner;
public class Act5 {

    
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String name,wood_name = null,colour_name;
	System.out.print("Enter your name : ");
	name = a.nextLine();
	System.out.print("Enter type wood needed (1 for oak and 2 for mahogany) : ");
	int wood = a.nextInt();
	System.out.print("Enter number of character wanted on the sign : ");
	int number = a.nextInt();
	System.out.print("Enter the colour type(1 for black-and-white and 2 for gold-leaf-lettering) : ");
	int colour = a.nextInt();
	int price = 30;
	if(wood == 1) {
            price +=15;
            wood_name = "Oak";
        }
        if (wood==2) {
            price +=10;
            wood_name = "Mahogany";
        }
        if (wood != 1 && wood != 2)
            System.out.println("SORRY, WRONG CODE FOR WOOD");
        if(number > 6)
            price += (number-6) * 3;
        if(colour==2) {
            price +=12;
            colour_name = "Gold-leaf-lettering";
        }
        else
            colour_name = "Black or white";
        System.out.println("Name = "+name);
        System.out.println("Type of wood = " + wood_name);
        System.out.println("Number of character = " + number);
        System.out.println("Colour of the character = " + colour_name);
        System.out.println("Total price is RM" + price);
    }
    
}
