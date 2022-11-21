/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.utils;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author Victor Henrich
 */
public class UtilsComponents {
    public static void disableButtons(ArrayList<JButton> buttons, boolean disable){
        for(JButton b: buttons)
            b.setEnabled(disable);
    }
}
