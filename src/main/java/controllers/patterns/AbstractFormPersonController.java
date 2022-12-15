
package controllers.patterns;

import models.enderecos.Address;
import models.enderecos.City;
import models.enderecos.District;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import models.pessoas.Person;
import repositories.enderecos.AddressRepository;
import repositories.enderecos.CityRepository;
import repositories.enderecos.DistrictRepository;
import view.components.AbstractFormPersonComponent;
import view.utils.UtilsComponents;


public abstract class AbstractFormPersonController<T extends AbstractFormPersonComponent, M extends Person> extends AbstractFormController<T, M>{
    
    protected ArrayList<City> cities;
    protected ArrayList<District> districts;
    protected Address addressLoaded;

    public AbstractFormPersonController(T form) {
        super(form);
        
        init();
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
    
    protected void enabledFields(boolean status){
        this.form.getjTextAreaObs().setEnabled(status);
        this.form.getjTextFieldEmail().setEnabled(status);
        this.form.getjTextFieldPhone1().setEnabled(status);
        this.form.getjTextFieldPhone2().setEnabled(status);
        this.form.getjTextFieldName().setEnabled(status);
        this.form.getjTextFieldStreet().setEnabled(status);
        this.form.getjComboBoxCity().setEnabled(status);
        this.form.getjComboBoxDistrict().setEnabled(status);
    }
    
    protected void loadFields(){
        if(this.registerLoaded == null) return;
        
        int indexDistrict = this.districts.indexOf(this.registerLoaded.getEndereco().getBairro());
        int indexCity = this.cities.indexOf(this.registerLoaded.getEndereco().getCidade());
        
        
        this.form.getjTextAreaObs().setText(this.registerLoaded.getObservacao());
        this.form.getjTextFieldEmail().setText(this.registerLoaded.getEmail());
        this.form.getjTextFieldPhone1().setText(this.registerLoaded.getFone1());
        this.form.getjTextFieldPhone2().setText(this.registerLoaded.getFone2());
        this.form.getjTextFieldName().setText(this.registerLoaded.getNome());
        this.form.getjTextFieldStreet().setText(this.registerLoaded.getComplementoEndereco());
        this.form.getjComboBoxCity().setSelectedIndex(indexCity);
        this.form.getjComboBoxDistrict().setSelectedIndex(indexDistrict);
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
