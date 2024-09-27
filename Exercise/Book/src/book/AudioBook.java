/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templa
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author USER
 */
public class AudioBook extends Book{
    private int size;
    private int length;
    private String artistName;
    
    public AudioBook(){
    }
    
    public AudioBook(String title, int yearOfPublication, String author,int size, int length,String artistName ){
        super(title, yearOfPublication, author);
        this.size=size;
        this.length=length;
        this.artistName=artistName;
    }
    
    public String toString(){
        return String.format(super.toString()+"Size :%d MB\nPlay Length :%d\nArtist's Name :%s\n",size,length,artistName);
    }
    
}
