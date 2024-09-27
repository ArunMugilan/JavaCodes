/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author USER
 */
public class PrintBook extends Book {
    public String publisher;
    private String isbn;
    
    public PrintBook (String title, int year, String author, String publisher, String isbn ){
        super(title, year, author);
        this.isbn=isbn;
        this.publisher=publisher;
        
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
    public String toString(){
        return super.toString()+""
                + "Publisher is " + publisher + "ISBN is " + isbn;
    }
    
}
