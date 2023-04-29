
package controllers.forms.addresses;

import controllers.builders.enderecos.CityBuilder;
import controllers.patterns.AbstractFormController;
import models.address.City;
import repositories.address.CityRepository;
import view.forms.CityFormComponent;

import javax.swing.*;


public class CityFormController extends AbstractFormController<CityFormComponent, City>{
    
    private final CityRepository repositoty = new CityRepository();

    public CityFormController() {
        super(new CityFormComponent());
    }
    
    private CityBuilder newCityBuilder(){
        try{
            return new CityBuilder()
                        .setDescricao(this.form.getjTextFieldDescription().getText());

        }catch(Exception error){
            JOptionPane.showMessageDialog(this.form, error.getMessage(), "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }
    
    private void createCity(){
        CityBuilder cityBuilder = this.newCityBuilder();

        if(cityBuilder == null) return;

        try{
            City city = cityBuilder.build();
            
            this.repositoty.create(city);

            JOptionPane.showMessageDialog(this.form, "Cidade cadastrada com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception error){
            String messageError = "Falha ao cadastrar Cidade\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void updateCity(){

        CityBuilder cityBuilder = this.newCityBuilder();

        if(cityBuilder == null) return;

        try{
            int id = this.registerLoaded.getId();
            
            City city = (City) cityBuilder.setId(id).build();
            
            this.repositoty.update(id, city);

            JOptionPane.showMessageDialog(this.form, "Cidade alterado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception error){
            String messageError = "Falha ao alterar Cidade\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    protected void resetStates() {
        this.form.getjTextFieldDescription().setText(null);
        
        this.form.getjTextFieldDescription().setEnabled(false);
    }

    @Override
    protected void onClickButtonNew() {
        this.form.getjTextFieldDescription().setEnabled(true);
    }

    @Override
    protected void onClickButtonWrite() {
        if(this.registerLoaded == null)
          this.createCity();
        
        else
          this.updateCity();
    }

    @Override
    protected void onClickButtonChange() {
        this.form.getjTextFieldDescription().setEnabled(true);
    }

    @Override
    protected void onShowComponent() {
        if(this.registerLoaded == null) return;
        
        this.form.getjTextFieldDescription().setText(this.registerLoaded.getDescricao());
    }
    
}
