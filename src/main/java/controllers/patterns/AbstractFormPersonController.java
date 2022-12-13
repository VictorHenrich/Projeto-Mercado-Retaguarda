
package controllers.patterns;

import models.enderecos.Address;
import models.enderecos.City;
import models.enderecos.District;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import models.patterns.BaseModel;
import repositories.enderecos.AddressRepository;
import repositories.enderecos.CityRepository;
import repositories.enderecos.DistrictRepository;
import view.components.AbstractFormPersonComponent;


public abstract class AbstractFormPersonController<T extends AbstractFormPersonComponent, M extends BaseModel> extends AbstractFormController<T, M>{
    
    protected ArrayList<City> cities;
    protected ArrayList<District> districts;
    protected Address addressLoaded;
    
    public AbstractFormPersonController(T form) {
        super(form);
        
        this.init();
    }
    
    private void init(){
        this.cities = (ArrayList<City>) new CityRepository().fetch();
        
        this.districts = (ArrayList<District>) new DistrictRepository().fetch();
        
        for(District d: this.districts)
            this.form.getjComboBoxDistrict().addItem(d.getDescricao());
        
        for(City c: this.cities)
            this.form.getjComboBoxCity().addItem(c.getDescricao());
        
        
        this.addActions();
    }
    
    private void loadAddress(){
        String cep = this.form.getjTextFieldCep().getText();
        
        ArrayList<Address> addresses = (ArrayList) new AddressRepository().fetch();
        
        
        for(Address a: addresses)
            if(a.getCep().toUpperCase().equals(cep))
                this.addressLoaded = a;
        
        if(this.addressLoaded == null){
            System.out.println("CEP não localizado!");
            return;
        }
        
        this.form.getjComboBoxCity().setSelectedItem(this.addressLoaded.getCidade());
        this.form.getjComboBoxDistrict().setSelectedItem(this.addressLoaded.getBairro());
        
        if(
            this.addressLoaded.getLogradouro().equals("") || 
            this.addressLoaded.getLogradouro() == null
        )
            return;
        
        this.form.getjTextFieldStreet().setText(this.addressLoaded.getLogradouro());
    }
    
    private void addActions(){
        
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
    }
    
    

}
