/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1;

/*******************************************************************************
 * Author : Arun Mugilan
 * Program : Practical test 1
 * Description : To demonstrate the simple Java Program
 * Date : 7 January 2022
 * Modified Date : None
 * Version : 1.0
 ******************************************************************************/
public class PT1 {

    
    public static void main(String[] args) {
        String NAME [] = {"MUHAMMAD", "HASSAN", "ZULKARNAIN", "BAHRUDDIN", "MOHD NOOR"};
        String STREAM [] = {"SCIENCE", "SCIENCE", "LITERATURE", "SCIENCE", "LITERATURE"};
        double STPM_CGPA [] = {3.08, 2.42, 2.42, 2.17, 3.23};
        String MALAY_SPM [] = {"A", "A", "B", "B", "A"};
        //String MT_SPM [] = {"A", "A", "A", "B", "A"};
        String HS_SPM [] = {"A", "A", "C", "A", "A"};
        //String SC_SPM [] = {"B", "C", "B", "A", "C"};
        String GS_STPM [] = {"C", "C", "B", "C", "D"};
        String MALAY_STPM [] = {"A", "B", "C", "C", "A"};
        String ICT_STPM [] = {"A", "A", "NIL", "C", "NIL"};
        String MT_STPM [] = {"B", "D", "NIL", "C", "NIL"};
        double MUET [] = {4, 4, 3, 2, 2};
  
        
        // generic
        for (int i=0; i<NAME.length; i++){
            if ("A".equals(MALAY_SPM[i])||"B".equals(MALAY_SPM[i])||"C".equals(MALAY_SPM[i])){
                if ("A".equals(HS_SPM[i])||"B".equals(HS_SPM[i])||"C".equals(HS_SPM[i]))
                    if (STPM_CGPA[i] >= 2)
                        if (MUET[i] >= 1)
                            if ("A".equals(GS_STPM[i])||"B".equals(GS_STPM[i])||"C".equals(GS_STPM[i]))
                                System.out.println("NAME : " + NAME[i]);
                                System.out.println("GENERIC REQUIREMENT : PASS");
                                System.out.println();
                }
                else{
                    System.out.println("NAME : " + NAME[i]);
                    System.out.println("GENERIC REQUIREMENT : NOT PASS");
                    System.out.println();
                }
            }
        // specific
        for (int i=0; i<NAME.length; i++){
            if ("A".equals(GS_STPM[i])||"B".equals(GS_STPM[i])||"C".equals(GS_STPM[i])){
                if ("A".equals(MALAY_STPM[i])||"B".equals(MALAY_STPM[i])||"C".equals(MALAY_STPM[i]))
                    if ("A".equals(ICT_STPM[i])||"B".equals(ICT_STPM[i])||"C".equals(ICT_STPM[i]))
                        if ("A".equals(MT_STPM[i])||"B".equals(ICT_STPM[i])||"C".equals(MT_STPM[i]))
                            System.out.println("NAME : " + NAME[i]);
                                System.out.println("SPECIFIC REQUIREMENT : PASS");
                                System.out.println();
                            }
                           else if ("SCIENCE".equals(STREAM[i])){
                if ("A".equals(MT_STPM[i])||"B".equals(ICT_STPM[i])||"C".equals(MT_STPM[i]))
                    if ("A".equals(MT_STPM[i])||"B".equals(ICT_STPM[i])||"C".equals(MT_STPM[i]))
                        if (MUET[i] >= 2)
                            System.out.println("NAME : " + NAME[i]);
                System.out.println("SPECIFIC REQUIREMENT : PASS");
                System.out.println();
                                   }
            else{
                               if ("NIL".equals(ICT_STPM[i]))
                                   if ("A".equals(MT_STPM[i]))
                                       System.out.println("NAME : " + NAME[i]);
                               System.out.println("SPECIFIC REQUIREMENT : NOT PASS");
                               System.out.println();
            }
        }
    }
}
            


        

  
