/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstsubclass;

/**
 *
 * @author USER
 */

import java.awt.*;
import javax.swing.*;

public class Ch14JFrameSubclass1 extends JFrame{
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    public Ch14JFrameSubclass1(){
        setTitle ("My First Subclass");
        setSize (FRAME_WIDTH, FRAME_HEIGHT);
        setLocation (FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
    }

    
}
