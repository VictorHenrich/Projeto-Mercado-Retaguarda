
package view.components;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import models.enderecos.Address;
import models.enderecos.City;
import models.enderecos.District;
import view.utils.UtilsComponents;


public abstract class AbstractFormPersonComponent extends AbstractFormComponent{
    protected javax.swing.JTextField jTextFieldName;
    protected javax.swing.JTextField jTextFieldPhone1;
    protected javax.swing.JTextField jTextFieldPhone2;
    protected javax.swing.JTextField jTextFieldEmail;
    protected javax.swing.JTextArea jTextAreaObs;
    protected javax.swing.JComboBox<String> jComboBoxStatus;
    protected javax.swing.JTextField jTextFieldStreet;
    protected javax.swing.JComboBox<City> jComboBoxCity;
    protected javax.swing.JComboBox<District> jComboBoxDistrict;
    protected javax.swing.JTextField jTextFieldCity;
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
    
    public void activateFieldsPerson(boolean status){
        ArrayList<JComponent> fields = new ArrayList();
        
        fields.add(this.jComboBoxCity);
        fields.add(this.jComboBoxDistrict);
        fields.add(this.jComboBoxStatus);
        fields.add(this.jTextAreaObs);
        fields.add(this.jTextFieldCep);
        fields.add(this.jTextFieldCity);
        fields.add(this.jTextFieldEmail);
        fields.add(this.jTextFieldName);
        fields.add(this.jTextFieldPhone1);
        fields.add(this.jTextFieldPhone2);
        fields.add(this.jTextFieldStreet);
        
        UtilsComponents.disabledComponents(fields, !status);
    }

    public JComboBox<City> getjComboBoxACity() {
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

    public JComboBox<String> getjComboBoxStatus() {
        return jComboBoxStatus;
    }

    public JTextField getjTextFieldStreet() {
        return jTextFieldStreet;
    }

    public JComboBox<Address> getjComboBoxAdress() {
        return jComboBoxAdress;
    }

    public JTextField getjTextFieldCity() {
        return jTextFieldCity;
    }

    public JTextField getjTextFieldCep() {
        return jTextFieldCep;
    }

    public JLabel getjLabelStatus() {
        return jLabelStatus;
    }
    
    
}
