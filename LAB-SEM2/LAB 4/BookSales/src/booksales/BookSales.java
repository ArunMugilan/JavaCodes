/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booksales;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
public class BookSales {

    private double priceperbook;
    private String memembership;
    private String book;
    private int quantity;
    
    
    public BookSales(String typeofbook, String typeofmembership, int quantity){
        setMembership(typeofmembership);
        setBook(typeofbook);
        setQuantity(quantity);
        
        
        if(getBook().equals("A")){
            this.priceperbook = 100.00;
        }
        else if(getBook().equals("B")){
            this.priceperbook = 50.00;
        }
        if(getMembership().equals("Y")){
            priceperbook = (priceperbook*quantity) - ((priceperbook*quantity)*0.15);
        }
        else if(getMembership().equals("N")){
            priceperbook = priceperbook*quantity;
        }
    }
    
    public double getPriceperbook(double priceperbook){
        return (this.priceperbook);
    }
    
    public void setPriceperbook(double priceperbook){
        this.priceperbook = priceperbook;
    }
    
    public String getMembership(){
        return (this.memembership);
    }
    
    public void setMembership(String typeofmembership){
        this.memembership = typeofmembership;
    }

    public String getBook(){
        return this.book;
    }

    public void setBook(String book){
        this.book = book;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    
    public void DisplayPrice(){
        System.out.println("--TOTAL : RM "+priceperbook + "--");
    }
    
}

