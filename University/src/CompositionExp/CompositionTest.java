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
public class CompositionTest {
    public static void main(String[] args){
        
        University umt = new University("Universiti Malaysia Terengganu");
        
        umt.setStudent(umt.getListOfStudents());
        System.out.print("The students of "+umt.getUniversityName()+" are ");
        for(Student S : umt.getStudent()){
            System.out.print(S.getStudentName()+ ", ");
        }
        System.out.println();
    }
}
