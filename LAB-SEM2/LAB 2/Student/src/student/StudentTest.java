/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// ARUN MUGILAN A/L SARGUNAN S63746 //

package student;


public class StudentTest {
    public static void main (String[] args){
        Student obj1Student = new Student();
        Student obj2Student = new Student("S63746","Arun Mugilan","Active");
        
        System.out.println("Student ID : " + obj2Student.getStudentID());
        System.out.println("Student Name : " + obj2Student.getStudentName());
        System.out.println("Status : " + obj2Student.getStudentStatus());
        
    }
    
}
