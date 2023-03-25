
package controllers.forms.addresses;

import controllers.builders.enderecos.CityBuilder;
import controllers.patterns.AbstractFormController;
import models.address.City;
import repositories.address.CityRepository;
import view.forms.CityFormComponent;


public class CityFormController extends AbstractFormController<CityFormComponent, City>{
    
    private final CityRepository repositoty = new CityRepository();

    public CityFormController() {
        super(new CityFormComponent());
    }
    
    private CityBuilder newCityBuilder(){
        return new CityBuilder()
                       .setDescricao(this.form.getjTextFieldDescription().getText());
    }
    
    private void createCity(){
        try{
            
            int id = this.repositoty.nextID();
            
            City city = this.newCityBuilder().build(id);
            
            this.repositoty.create(city);
            
            System.out.println("Cidade cadastrada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar Cidade\nErro: " + error.getMessage());
        }
    }
    
    private void updateCity(){
        try{
            int id = this.registerLoaded.getId();
            
            City city = this.newCityBuilder().build(id);
            
            this.repositoty.update(id, city);
            
        }catch(Exception error){
            
            System.out.println("Falha ao cadastrar Cidade\nErro: " + error.getMessage());
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
