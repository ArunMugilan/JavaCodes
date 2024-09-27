/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subjectenum;

/**
 *
 * ARUN MUGILAN A/L SARGUNAN S63746
 */
public enum SubjectEnum {
    CSE3501("Software Engineering Basic", "BSC(SE)"),
    CSE3502("Software Requirement Engineering", "BSC(SE)"),
    CSE3503("Software Architecture", "BSC(SE)"),
    CSE3504("Software Testing", "BSC(SE)"),
    MMM3401("Principle of Maritime Management", "BSC(IM)"),
    CSA3501("Maritime Informatics Technology "
            + "and Application", "BSC(IM)");

    private final String subject;
    private final String course;
    
    SubjectEnum(String subjectname, String basic){
        subject = subjectname;
        course= basic;
    }
    public String getSubject(){
        return subject;
    }

    public String getCourse(){
        return course;
    }
    
}

    
    

