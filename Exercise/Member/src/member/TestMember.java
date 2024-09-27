/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package member;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class TestMember {
    public static void main (String[] args){
        ArrayList<Member>member = new ArrayList(2);
        Corporate C1 = new Corporate();
        C1.setName("Moringayyyyy");
        C1.setPhone("012548788");
        C1.setFees(500);
        C1.setAddress("Kuala Terengganu");
        
        Individual I1 = new Individual();
        I1.setName("Moringayyyy");
        I1.setPhone("012548788");
        I1.setFees(500);
        I1.setSsn("1235-12-12354");
        
        member.add(C1);
        member.add(I1);
        
        for (Member array: member){
            System.out.println(array);
        }
    }
    
}
