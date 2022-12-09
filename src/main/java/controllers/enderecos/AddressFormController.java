
package controllers.enderecos;

import controllers.builders.enderecos.AddressBuilder;
import controllers.patterns.AbstractFormController;
import java.util.ArrayList;
import models.enderecos.Address;
import models.enderecos.City;
import models.enderecos.District;
import repositories.enderecos.AddressRepository;
import repositories.enderecos.CityRepository;
import repositories.enderecos.DistrictRepository;
import view.AddressFormComponent;


public class AddressFormController extends AbstractFormController<AddressFormComponent, Address>{
    private final AddressRepository addressRepository;
    private final CityRepository cityRepository;
    private final DistrictRepository districtRepository;
    
    public AddressFormController(
            AddressFormComponent form,
            ArrayList<City> cities,
            ArrayList<District> districts
    ) {
        super(form);
        
        this.addressRepository = new AddressRepository(this.registers);
        this.cityRepository = new CityRepository(cities);
        this.districtRepository = new DistrictRepository(districts);
    }
    
    private AddressBuilder newAddressBuilder(){
        City city = this.cityRepository.load(this.form.getjComboBoxCity().getSelectedIndex());
        
        District district = this.districtRepository.load(this.form.getjComboBoxDistrict().getSelectedIndex());
        
        return new AddressBuilder()
                    .setLogradouro(this.form.getjTextFieldStreet().getText())
                    .setCep(this.form.getjTextFieldCep().getText())
                    .setBairro(district)
                    .setCidade(city);
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
    protected void initStates() {
        for(District d: this.districtRepository.fetch())
           this.form.getjComboBoxDistrict().addItem(d.getDescricao());
        
        for(City c: this.cityRepository.fetch())
            this.form.getjComboBoxCity().addItem(c.getDescricao());
        
        this.form.getjTextFieldCep().setEnabled(true);
        
        this.form.getjTextFieldStreet().setEnabled(true);
        
        this.form.getjComboBoxCity().setEnabled(true);
        
        this.form.getjComboBoxDistrict().setEnabled(true);
    }

    @Override
    protected void create() {
        try{
            int id = this.addressRepository.nextID();
            
            Address address = this.newAddressBuilder().build(id);
            
            this.addressRepository.create(address);
            
            System.out.println("Endereço cadastrado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar Endereço\nErro: " + error.getMessage());
        }
    }

    @Override
    protected void update() {
        try{
            int id = this.registerLoaded.getId();
            
            Address address = this.newAddressBuilder().build(id);
            
            this.addressRepository.update(id, address);
            
            System.out.println("Endereço alterado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar Endereço\nErro: " + error.getMessage());
        }
    }
    
}
