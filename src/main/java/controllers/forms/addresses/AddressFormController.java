
package controllers.forms.addresses;

import controllers.builders.enderecos.AddressBuilder;
import controllers.patterns.AbstractFormController;
import java.util.ArrayList;
import models.enderecos.Address;
import models.enderecos.City;
import models.enderecos.District;
import repositories.enderecos.AddressRepository;
import repositories.enderecos.CityRepository;
import repositories.enderecos.DistrictRepository;
import view.forms.AddressFormComponent;


public class AddressFormController extends AbstractFormController<AddressFormComponent, Address>{
    private final AddressRepository addressRepository = new AddressRepository();
    private ArrayList<City> cities;
    private ArrayList<District> districts;
    
    
    public AddressFormController() {
        super(new AddressFormComponent());
    }
    
    private AddressBuilder newAddressBuilder(){        
        City city = this.cities.get(this.form.getjComboBoxCity().getSelectedIndex());
        District district = this.districts.get(this.form.getjComboBoxDistrict().getSelectedIndex());
        
        return new AddressBuilder()
                    .setLogradouro(this.form.getjTextFieldStreet().getText())
                    .setCep(this.form.getjTextFieldCep().getText())
                    .setBairro(district)
                    .setCidade(city);
    }
    
    private void createAddress(){
        try{
            int id = this.addressRepository.nextID();
            
            Address address = this.newAddressBuilder().build(id);
            
            this.addressRepository.create(address);
            
            System.out.println("Endereço cadastrado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar Endereço\nErro: " + error.getMessage());
        }
    }
    
    private void updateAddress(){
        try{
            int id = this.registerLoaded.getId();
            
            Address address = this.newAddressBuilder().build(id);
            
            this.addressRepository.update(id, address);
            
            System.out.println("Endereço alterado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar Endereço\nErro: " + error.getMessage());
        }
    }

    @Override
    protected void resetStates() {
        this.form.getjTextFieldCep().setText(null);
        this.form.getjTextFieldCep().setEnabled(false);
        
        this.form.getjTextFieldStreet().setText(null);
        this.form.getjTextFieldStreet().setEnabled(false);
        
        this.form.getjComboBoxCity().setSelectedIndex(-1);
        this.form.getjComboBoxCity().setEnabled(false);
        
        this.form.getjComboBoxDistrict().setSelectedIndex(-1);
        this.form.getjComboBoxDistrict().setEnabled(false);
    }
    
    @Override
    protected void onShowComponent() {
        DistrictRepository districtRepository = new DistrictRepository();
        CityRepository cityRepository = new CityRepository();
        
        this.cities = (ArrayList<City>) cityRepository.fetch();
        this.districts = (ArrayList<District>) districtRepository.fetch();
        
        for(District d: districts)
           this.form.getjComboBoxDistrict().addItem(d.getDescricao());
        
        for(City c: cities)
            this.form.getjComboBoxCity().addItem(c.getDescricao());
    }

    @Override
    protected void onClickButtonNew() {
        this.form.getjTextFieldCep().setEnabled(true);
        
        this.form.getjTextFieldStreet().setEnabled(true);
        
        this.form.getjComboBoxCity().setEnabled(true);
        
        this.form.getjComboBoxDistrict().setEnabled(true);
    }

    @Override
    protected void onClickButtonWrite() {
        if(this.registerLoaded == null)
            this.createAddress();
        
        else
            this.updateAddress();
    }

    @Override
    protected void onClickButtonChange() {
        this.form.getjTextFieldCep().setEnabled(true);
        
        this.form.getjTextFieldStreet().setEnabled(true);
        
        this.form.getjComboBoxCity().setEnabled(true);
        
        this.form.getjComboBoxDistrict().setEnabled(true);
    }
    
}
