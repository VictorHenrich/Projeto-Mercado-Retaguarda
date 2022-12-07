
package view.components;

import java.util.ArrayList;
import javax.swing.JComponent;
import view.utils.UtilsComponents;


public abstract class AbstractRegistrationComponent extends javax.swing.JFrame {

    public AbstractRegistrationComponent() {
        this.initStates();
    }
    
    abstract protected void clearStates();
    
    abstract protected void onClickButtonWrite();
    
    abstract protected void onClickButtonChange();
    
    private void initStates(){
        ArrayList<JComponent> buttonsEnabled = new ArrayList();
        ArrayList<JComponent> buttonsDisabled = new ArrayList();
        
        buttonsDisabled.add(jButtonCancel);
        buttonsDisabled.add(jButtonChange);
        buttonsDisabled.add(jButtonWrite);
        
        buttonsEnabled.add(jButtonNew);
        buttonsEnabled.add(jButtonOut);
        
        UtilsComponents.disabledComponents(buttonsEnabled, false);
        UtilsComponents.disabledComponents(buttonsDisabled, true);   
    }
    
    
    protected void activateButton(boolean activated){
        ArrayList<JComponent> buttons = new ArrayList();
        
        buttons.add(jButtonCancel);
        buttons.add(jButtonChange);
        buttons.add(jButtonWrite);
        
        UtilsComponents.disabledComponents(buttons, !activated);
    }
    
    
    protected void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.activateButton(true);
        
    }                                          

    protected void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.activateButton(false);
    }                                             

    protected void jButtonOutActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.activateButton(true);
        this.clearStates();
        this.dispose();
    }                                          

    protected void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.onClickButtonChange();
    }                                             

    protected void jButtonWriteActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.onClickButtonWrite();
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
