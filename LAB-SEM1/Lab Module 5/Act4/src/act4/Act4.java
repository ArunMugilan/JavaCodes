/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act4;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import javax.swing.JOptionPane;
public class Act4 {

    
    public static void main(String[] args) {
        String day = null;
        String input = JOptionPane.showInputDialog("Key in any date (DD/MM/YYYY) :");
	String date = input.substring(0,2);
	String month = input.substring(3,5);
	String year = input.substring(6,10);
        int q = Integer.parseInt(date);
        int m = Integer.parseInt(month);
	int y = Integer.parseInt(year);
        if(m == 1) {
            m =13;
            y -=1;
        }
	if(m == 2) {
            m =14;
            y -=1;
        }
        int h = (q + ((13*(m+1))/5) + y + (y/4) - (y/100) + (y/400)) % 7;
        int k = y & 7;
	switch(h) {
            case 0: day="Saturday";
                break;
            case 1: day="Sunday";
                break;
            case 2: day="Monday";
                break;
            case 3 : day="Tuesday";
                break;
            case 4: day="Wednesday";
                break;
            case 5: day="Thursday";
                break;
            case 6: day="Friday";
                break;
            default:
        }
        JOptionPane.showMessageDialog(null,"The day is "+ day);
    }
    
}
