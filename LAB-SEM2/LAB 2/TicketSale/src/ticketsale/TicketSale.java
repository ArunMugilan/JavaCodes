/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// ARUN MUGILAN A/L SARGUNAN S63746 //
package ticketsale;
public class TicketSale {

    private int num;
    private char seat;
    private double price;
    
    public TicketSale(){
        
    }
    
    public TicketSale(char Seat, double Price){
      setSeat(Seat);
      setPrice(Price);
      setNum(0);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public char getSeat() {
        return seat;
    }

    public void setSeat(char seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    double GetTotal (){
        return price*num;
    }
    
}
