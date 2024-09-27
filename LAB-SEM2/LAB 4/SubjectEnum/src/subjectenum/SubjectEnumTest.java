/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subjectenum;



/**
 *
 * ARUN MUGILAN A/L SARGILAN S63746
 */

import java.util.EnumSet;
import java.util.Iterator;
public class SubjectEnumTest {
    public static void main(String[] args) {
        
        System.out.println("Display all subjects : \n");
        for (SubjectEnum subjects : SubjectEnum.values()) {
            System.out.printf("%-10s%-45s%s\n", subjects, subjects.getSubject(), subjects.getCourse());
        }
        
        System.out.println();
        System.out.println("\nDisplay subjects that are between subject code CSE3501 and subject code CSE3503 : \n");
        for (SubjectEnum subjects : EnumSet.range(SubjectEnum.CSE3501, SubjectEnum.CSE3503)) {
            System.out.printf("%-10s%-45s%s\n", subjects, subjects.getSubject(), subjects.getCourse());
        }
        
        System.out.println();
        System.out.println("\nDisplay subject CSE3502 and CSE3504: \n");
        for (SubjectEnum subjects : EnumSet.of(SubjectEnum.CSE3502, SubjectEnum.CSE3504)) {
            System.out.printf("%-10s%-45s%s\n", subjects, subjects.getSubject(), subjects.getCourse());
        }
       
    }
    
}
