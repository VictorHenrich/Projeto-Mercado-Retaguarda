
package controllers.forms.addresses;

import controllers.builders.enderecos.AddressBuilder;
import controllers.patterns.AbstractFormController;
import java.util.ArrayList;
import models.address.Address;
import models.address.City;
import models.address.District;
import repositories.address.AddressRepository;
import repositories.address.CityRepository;
import repositories.address.DistrictRepository;
import view.forms.AddressFormComponent;

import javax.swing.*;


public class AddressFormController extends AbstractFormController<AddressFormComponent, Address>{
    private final AddressRepository addressRepository = new AddressRepository();
    private ArrayList<City> cities;
    private ArrayList<District> districts;
    
    
    public AddressFormController() {
        super(new AddressFormComponent());
    }
    
    private AddressBuilder newAddressBuilder(){
        City city = null;
        District district = null;
        
        if(!this.cities.isEmpty())
            city = this.cities.get(this.form.getjComboBoxCity().getSelectedIndex());
        
        if(!this.districts.isEmpty())
            district = this.districts.get(this.form.getjComboBoxDistrict().getSelectedIndex());

        try{
            return new AddressBuilder()
                    .setLogradouro(this.form.getjTextFieldStreet().getText())
                    .setCep(this.form.getjTextFieldCep().getText())
                    .setBairro(district)
                    .setCidade(city);

        }catch(Exception error){
            JOptionPane.showMessageDialog(this.form, error.getMessage(), "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
    
    private void createAddress(){
        AddressBuilder addressBuilder = this.newAddressBuilder();

        if(addressBuilder == null) return;

        Address address = addressBuilder.build();

        try{
            this.addressRepository.create(address);

            JOptionPane.showMessageDialog(this.form, "Endereço cadastrado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        }catch(Exception error){
            String messageError = "Falha ao cadastrar Endereço!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void updateAddress(){
        AddressBuilder addressBuilder = this.newAddressBuilder();

        if(addressBuilder == null) return;

        try{
            int id = this.registerLoaded.getId();

            Address address = (Address) addressBuilder.setId(id).build();

            this.addressRepository.update(address);

            JOptionPane.showMessageDialog(this.form, "Endereço alterado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        }catch(Exception error){
            String messageError = "Falha ao alterar Endereço!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadFields(){
        if(this.registerLoaded == null) return;
        
        this.form.getjTextFieldCep().setText(this.registerLoaded.getCep());
        this.form.getjTextFieldStreet().setText(this.registerLoaded.getLogradouro());
        
        if(this.registerLoaded.getCidade() != null && !this.cities.isEmpty()){
            for(int cityIndex=0; cityIndex < this.cities.size(); cityIndex++){
                City city = this.cities.get(cityIndex);

                if(city.getId() == this.registerLoaded.getCidade().getId())
                    this.form.getjComboBoxCity().setSelectedIndex(cityIndex);
            }
        }
        
        if(this.registerLoaded.getBairro() != null && !this.districts.isEmpty()){
            for(int districtIndex=0; districtIndex < this.districts.size(); districtIndex++){
                District district = this.districts.get(districtIndex);

                if(district.getId() == this.registerLoaded.getBairro().getId())
                    this.form.getjComboBoxDistrict().setSelectedIndex(districtIndex);
            }
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
        try{
            if(this.form.getjComboBoxCity().getItemCount() > 0)
                this.form.getjComboBoxCity().removeAllItems();

            if(this.form.getjComboBoxDistrict().getItemCount() > 0)
                this.form.getjComboBoxDistrict().removeAllItems();

            DistrictRepository districtRepository = new DistrictRepository();
            CityRepository cityRepository = new CityRepository();

            this.cities = (ArrayList<City>) cityRepository.fetch();
            this.districts = (ArrayList<District>) districtRepository.fetch();

            for(District d: districts)
                this.form.getjComboBoxDistrict().addItem(d.getDescricao());

            for(City c: cities)
                this.form.getjComboBoxCity().addItem(c.getDescricao());

            loadFields();

        }catch(Exception error){
            System.out.println(error.getMessage());
        }
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
