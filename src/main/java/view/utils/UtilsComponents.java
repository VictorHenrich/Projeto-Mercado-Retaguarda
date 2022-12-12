
package view.utils;

import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;


public class UtilsComponents {
    public static void disabledComponents(ArrayList<JComponent> components, boolean disable){
        for(JComponent component: components)
            component.setEnabled(disable);
    }
    
    public static void clearFields(ArrayList<JTextComponent> fields){
        for(JTextComponent field: fields)
            field.setText("");
    }
}
