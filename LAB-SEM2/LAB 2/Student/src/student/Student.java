/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// ARUN MUGILAN A/L SARGUNAN S63746 //

package student;

public class Student {
    private String studentID;
    private String studentName;
    private String studentStatus;
    
    public Student(){
        System.out.println("Student Class");
        System.out.println("=============");
        System.out.println(" ");
    }
    
    public Student(String id, String name){
        setStudentID(id);
        setStudentName(name);
}
    public Student(String id, String name, String status){
        setStudentID(id);
        setStudentName(name);
        setStudentStatus(status);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(String studentStatus) {
        this.studentStatus = studentStatus;
    }
}  
