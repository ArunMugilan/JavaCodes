/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositionExp;

import java.util.*;

/**
 *
 * @author USER
 */
public class University {

    private String uniName;
    private List<Student> student;
    
    public University (String name){
        this.uniName= name;
    }

    public String getUniversityName() {
        return uniName;
    }
    
    
    public List<Student> getListOfStudents(){
        Student P1 = new Student ("Justin", 19);
        Student P2 = new Student ("Jose", 19);
        Student P3 = new Student ("Mary", 19);
        Student P4 = new Student ("Joseph", 19);
        List<Student> listOfStudent= new ArrayList<>();
        listOfStudent.add(P1);
        listOfStudent.add(P2);
        listOfStudent.add(P3);
        listOfStudent.add(P4);
        return listOfStudent;
        
    }

    public void setUniversityName(String uniName) {
        this.uniName = uniName;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
    
}
