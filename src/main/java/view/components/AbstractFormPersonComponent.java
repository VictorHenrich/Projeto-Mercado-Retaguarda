
package view.components;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import models.enderecos.City;
import models.enderecos.District;
import view.utils.UtilsComponents;


public abstract class AbstractFormPersonComponent extends AbstractFormComponent{
    protected javax.swing.JTextField jTextFieldName;
    protected javax.swing.JTextField jTextFieldPhone1;
    protected javax.swing.JTextField jTextFieldPhone2;
    protected javax.swing.JTextField jTextFieldEmail;
    protected javax.swing.JTextArea jTextAreaObs;
    protected javax.swing.JTextField jTextFieldStreet;
    protected javax.swing.JComboBox<City> jComboBoxCity;
    protected javax.swing.JComboBox<District> jComboBoxDistrict;
    protected javax.swing.JTextField jTextFieldCep;
    protected javax.swing.JLabel jLabelStatus;
    protected javax.swing.JLabel jLabelPhone1;
    protected javax.swing.JLabel jLabelPhone2;
    protected javax.swing.JLabel jLabelStreet;
    protected javax.swing.JLabel jLabelCep;
    protected javax.swing.JLabel jLabelCity;
    protected javax.swing.JLabel jLabelDistrict;
    protected javax.swing.JLabel jLabelEmail;
    protected javax.swing.JLabel jLabelName;
    protected javax.swing.JLabel jLabelObs;
    protected javax.swing.JPanel jPanelContainerStatus;
    
    public void activateFieldsPerson(boolean status){
        ArrayList<JComponent> fields = new ArrayList();
        ArrayList<JTextComponent> textFields = new ArrayList();
        
        fields.add(this.jComboBoxCity);
        fields.add(this.jComboBoxDistrict);
        fields.add(this.jTextAreaObs);
        fields.add(this.jTextFieldCep);
        fields.add(this.jTextFieldEmail);
        fields.add(this.jTextFieldName);
        fields.add(this.jTextFieldPhone1);
        fields.add(this.jTextFieldPhone2);
        fields.add(this.jTextFieldStreet);
        
        textFields.add(this.jTextFieldCep);
        textFields.add(this.jTextFieldEmail);
        textFields.add(this.jTextFieldName);
        textFields.add(this.jTextFieldPhone1);
        textFields.add(this.jTextFieldPhone2);
        textFields.add(this.jTextAreaObs);
        textFields.add(this.jTextFieldStreet);
        
        UtilsComponents.disabledComponents(fields, status);
        UtilsComponents.clearFields(textFields);
    }

    public javax.swing.JPanel getjPanelContainerStatus(){
        return jPanelContainerStatus;
    }

    public JComboBox<City> getjComboBoxCity() {
        return jComboBoxCity;
    }

    public JComboBox<District> getjComboBoxDistrict() {
        return jComboBoxDistrict;
    }

    public JLabel getjLabelPhone1() {
        return jLabelPhone1;
    }

    public JLabel getjLabelPhone2() {
        return jLabelPhone2;
    }

    public JLabel getjLabelStreet() {
        return jLabelStreet;
    }

    public JLabel getjLabelCep() {
        return jLabelCep;
    }

    public JLabel getjLabelCity() {
        return jLabelCity;
    }

    public JLabel getjLabelDistrict() {
        return jLabelDistrict;
    }

    public JLabel getjLabelEmail() {
        return jLabelEmail;
    }

    public JLabel getjLabelName() {
        return jLabelName;
    }

    public JLabel getjLabelObs() {
        return jLabelObs;
    }
    

    public JTextField getjTextFieldName() {
        return jTextFieldName;
    }

    public JTextField getjTextFieldPhone1() {
        return jTextFieldPhone1;
    }

    public JTextField getjTextFieldPhone2() {
        return jTextFieldPhone2;
    }

    public JTextField getjTextFieldEmail() {
        return jTextFieldEmail;
    }

    public JTextArea getjTextAreaObs() {
        return jTextAreaObs;
    }

    public JTextField getjTextFieldStreet() {
        return jTextFieldStreet;
    }

    public JTextField getjTextFieldCep() {
        return jTextFieldCep;
    }

    public JLabel getjLabelStatus() {
        return jLabelStatus;
    }
    
    
}
