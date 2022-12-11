
package view.components;

import java.util.ArrayList;
import javax.swing.JButton;
import view.utils.UtilsComponents;


public abstract class AbstractFormComponent extends javax.swing.JFrame{
    
    public void activateButtons(boolean state){
        ArrayList<javax.swing.JComponent> buttonsActivated = new ArrayList();
        ArrayList<javax.swing.JComponent> buttonsDeactivated = new ArrayList();
        
        buttonsActivated.add(this.jButtonCancel);
        buttonsActivated.add(this.jButtonWrite);
        buttonsActivated.add(this.jButtonChange);
        
        buttonsDeactivated.add(this.jButtonNew);
        buttonsDeactivated.add(this.jButtonOut);
        
        UtilsComponents.disabledComponents(buttonsActivated, state);
        UtilsComponents.disabledComponents(buttonsDeactivated, !state);
    }

    public JButton getjButtonCancel() {
        return jButtonCancel;
    }

    public JButton getjButtonChange() {
        return jButtonChange;
    }

    public JButton getjButtonNew() {
        return jButtonNew;
    }

    public JButton getjButtonOut() {
        return jButtonOut;
    }

    public JButton getjButtonWrite() {
        return jButtonWrite;
    }
    
    
    
    protected javax.swing.JButton jButtonCancel;
    protected javax.swing.JButton jButtonChange;
    protected javax.swing.JButton jButtonNew;
    protected javax.swing.JButton jButtonOut;
    protected javax.swing.JButton jButtonWrite;
    protected javax.swing.JLabel jLabelTitle;
    protected javax.swing.JPanel jPanelBody;
    protected javax.swing.JPanel jPanelFooter;
    protected javax.swing.JPanel jPanelHeader;
    
}
