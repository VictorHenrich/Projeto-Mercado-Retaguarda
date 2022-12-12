
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
    
    private final CityRepository cityRepository;
    private final DistrictRepository districtRepository;
    private final AddressRepository addressRepository;
    protected Address addressLocated = null;
    
    public AbstractFormPersonController(
            T form,
            ArrayList<City> cities,
            ArrayList<District> districts,
            ArrayList<Address> addresses
    ) {
        super(form);
        
        
        this.cityRepository = new CityRepository(cities);
        this.districtRepository = new DistrictRepository(districts);
        this.addressRepository = new AddressRepository(addresses);
        
        this.initComponentPerson();
    }
    
    private void loadAddress(){
        String cep = this.form.getjTextFieldCep().getText();
        
        ArrayList<Address> addresses = (ArrayList) this.addressRepository.fetch();
        
        
        for(Address a: addresses)
            if(a.getCep().toUpperCase().equals(cep))
                this.addressLocated = a;
        
        if(this.addressLocated == null){
            System.out.println("CEP não localizado!");
            return;
        }
        
        this.form.getjComboBoxCity().setSelectedItem(addressLocated.getCidade());
        this.form.getjComboBoxDistrict().setSelectedItem(addressLocated.getBairro());
        
        if(
            addressLocated.getLogradouro().equals("") || 
            addressLocated.getLogradouro() == null
        )
            return;
        
        this.form.getjTextFieldStreet().setText(addressLocated.getLogradouro());
    }
    
    
    private void populateFieldsAddress(){
        ArrayList<City> cities = (ArrayList<City>) this.cityRepository.fetch();
        ArrayList<District> districts = (ArrayList<District>) this.districtRepository.fetch();
        
        for(City city: cities)
            this.form.getjComboBoxCity().addItem(city);
        
        for(District district: districts)
            this.form.getjComboBoxDistrict().addItem(district);
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
        
        this.populateFieldsAddress();
    }
    
    

}
