
package view.components;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import view.utils.UtilsComponents;

public class AbstractListComponent extends javax.swing.JFrame{
    protected javax.swing.JButton jButtonDelete;
    protected javax.swing.JButton jButtonSearch;
    protected javax.swing.JButton jButtonUpdate;
    protected javax.swing.JLabel jLabelTitle;
    protected javax.swing.JPanel jPanelBody;
    protected javax.swing.JPanel jPanelFooter;
    protected javax.swing.JPanel jPanelHeader;
    protected javax.swing.JScrollPane jScrollPaneTable;
    protected javax.swing.JTable jTableList;

    public JButton getjButtonDelete() {
        return jButtonDelete;
    }

    public JButton getjButtonSearch() {
        return jButtonSearch;
    }

    public JButton getjButtonUpdate() {
        return jButtonUpdate;
    }

    public JLabel getjLabelTitle() {
        return jLabelTitle;
    }

    public JPanel getjPanelBody() {
        return jPanelBody;
    }

    public JPanel getjPanelFooter() {
        return jPanelFooter;
    }

    public JPanel getjPanelHeader() {
        return jPanelHeader;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPaneTable;
    }

    public JTable getjTableList() {
        return jTableList;
    }
    
    
    
    public void enabledButtons(boolean status){
        ArrayList<javax.swing.JComponent> buttons = new ArrayList();
        
        buttons.add(this.jButtonDelete);
        buttons.add(this.jButtonUpdate);
        
        UtilsComponents.disabledComponents(buttons, status);
    }
}
