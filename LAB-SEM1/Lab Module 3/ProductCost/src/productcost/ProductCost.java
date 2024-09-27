/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productcost;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Overage Fee
 * Description : To demonstrate the simple Java Program
 * Date : 18 October 2021
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
import javax.swing.JOptionPane;

public class ProductCost {
    
    public static void main(String[] args) {
         double after;
        String price = JOptionPane.showInputDialog("Enter the price(RM) : ");
        float dprice = Float.parseFloat(price);      
        after =  dprice + (dprice * 6/100);
        after = Math.round(after * 100.0 ) / 100.0 ;
        JOptionPane.showMessageDialog(null, "Total cost of the product is : RM" + after);
    }
    
}
