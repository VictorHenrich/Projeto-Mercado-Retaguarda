/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.utils;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author aluno
 */
public class UtilsView {
    public static void enabledButtons(boolean enabled, ArrayList<JButton> buttons){
        for(JButton button: buttons){
            button.setEnabled(enabled);
        }
    }
}