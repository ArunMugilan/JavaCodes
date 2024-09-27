/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csf1819;


public class Sale {

    public String NC, S, M, name;
    public double priceBefore, priceAfter, discount, bookPrice;
    public int quantity;
    
    public Sale(double bookPrice){
        setBookPrice(bookPrice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double priceBefore() {
        return quantity*bookPrice;
    }


    public double priceAfter() {
        return quantity*bookPrice*discount;
    }
    
    public double setQuantity(int quantity) {
        return quantity;
    }


    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
    
    public void typeOfCustomer(String TOC){
        String typeOfCustomer = null;
        if(TOC == null ? NC == null : TOC.equals(NC)){
            discount = 0.05;
            priceAfter=quantity*bookPrice*discount;
        }else if (TOC == null ? S == null : TOC.equals(S)){
            discount = 0.07;
            priceAfter=quantity*bookPrice*discount;
        }else if (TOC == null ? M == null : TOC.equals(M)){
            discount = 0.1;
            priceAfter=quantity*bookPrice*discount;
        }
            
        
    }
    
    
    
}
