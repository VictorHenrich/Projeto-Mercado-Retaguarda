
package controllers.enderecos;

import controllers.builders.enderecos.CityBuilder;
import controllers.patterns.AbstractFormController;
import models.enderecos.City;
import repositories.enderecos.CityRepository;
import view.CityFormComponent;


public class CityFormController extends AbstractFormController<CityFormComponent, City>{
    
    private final CityRepository repositoty;
    
    public CityFormController(CityFormComponent form) {
        super(form);
        
        this.repositoty = new CityRepository();
    }
    
    private CityBuilder newCityBuilder(){
        return new CityBuilder()
                       .setDescricao(this.form.getjTextFieldDescription().getText());
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
    protected void onClickButtonCreate() {
        try{
            
            int id = this.repositoty.nextID();
            
            City city = this.newCityBuilder().build(id);
            
            this.repositoty.create(city);
            
            System.out.println("Cidade cadastrada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar Cidade\nErro: " + error.getMessage());
        }
    }

    @Override
    protected void onClickButtonUpdate() {
        try{
            
            int id = this.registerLoaded.getId();
            
            City city = this.newCityBuilder().build(id);
            
            this.repositoty.update(id, city);
            
        }catch(Exception error){
            
            System.out.println("Falha ao cadastrar Cidade\nErro: " + error.getMessage());
        }
    }
    
}
