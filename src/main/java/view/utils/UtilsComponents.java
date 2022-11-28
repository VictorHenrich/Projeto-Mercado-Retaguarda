
package view.utils;

import java.util.ArrayList;
import javax.swing.JComponent;


public class UtilsComponents {
    public static void disabledComponents(ArrayList<JComponent> buttons, boolean disable){
        for(JComponent component: buttons)
            component.setEnabled(disable);
    }
}
