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
public class Book {
    
    private String title;
    private int yearOfPublication;
    private String author;
    
    public Book(){
        
    }
    
    public Book(String title, int yearOfPublication, String author){
        setTitle(title);
        setYearOfPublication(yearOfPublication);
        setAuthor(author);
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String toString(){
        
         return "Title: " + title + "" + "\nAuthor: " + author + "" 
                + "\nYear of Publication: " + yearOfPublication + "\n";
    }
    
    
    
}
