
package controllers.patterns;

import java.awt.event.ActionEvent;
import models.enderecos.Address;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import models.patterns.BaseModel;
import repositories.enderecos.AddressRepository;
import view.components.AbstractFormPersonComponent;


public abstract class AbstractFormPersonController<T extends AbstractFormPersonComponent, M extends BaseModel> extends AbstractFormController<T, M>{
    
    private final AddressRepository addressRepository;
    
    public AbstractFormPersonController(
            T form,
            ArrayList<Address> addresses
    ) {
        super(form);
        
        this.addressRepository = new AddressRepository(addresses);
        
        this.initComponentPerson();
    }
    
    private void loadAddress(){
        String cep = this.form.getjTextFieldCep().getText();
        
        ArrayList<Address> addresses = (ArrayList) this.addressRepository.fetch();
        
        Address addressLocated = null;
        
        for(Address a: addresses)
            if(a.getCep().toUpperCase().equals(cep))
                addressLocated = a;
        
        if(addressLocated == null){
            System.out.println("CEP não localizado!");
            return;
        }
        
        this.form.getjComboBoxACity().setSelectedItem(addressLocated.getCidade());
        this.form.getjComboBoxAdress().setSelectedItem(addressLocated);
        this.form.getjComboBoxDistrict().setSelectedItem(addressLocated.getBairro());
        
        if(
            addressLocated.getLogradouro().equals("") || 
            addressLocated.getLogradouro() == null
        )
            return;
        
        this.form.getjTextFieldStreet().setText(addressLocated.getLogradouro());
    }
    
    private void initComponentPerson(){
        
        this.form.getjTextFieldCep().addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(
                    e.getKeyCode() != 10 || 
                    form.getjTextFieldCep().getText().equals("") ||
                    form.getjTextFieldCep().getText() == null
                ) return;
                
                loadAddress();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        
        this.form.getjComboBoxACity().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                form.populateFieldsWhenSelectCity();
            }
        });
    }
    
    

}
