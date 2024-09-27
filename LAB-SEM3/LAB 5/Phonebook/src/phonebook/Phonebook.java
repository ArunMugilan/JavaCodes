/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.ArrayList;


public class Phonebook {
    
    public class Person{
        private String name;
        private String number;

    public Person (String name,String number){
        this.name = name;
        this.number = number;
    }

    public String getName (){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }

    public void changeNumber(String newNumber){
        this.number = newNumber;
    }

    public String toString(){
        return this.getName() + " number : " +this.getNumber();
    }
    
    }
    
    
    private ArrayList<Person> phoneBook = new ArrayList<Person>();

    public void add(String name,String number){
    Person person = new Person (name,number);
    this.phoneBook.add(person);
    }

    public void printAll(){
        for (Person person : this.phoneBook){
            System.out.println(person);
        }
    }

    public String searchNumber(String name){
        for (Person person : this.phoneBook){
            if (person.getName().equals(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
    

