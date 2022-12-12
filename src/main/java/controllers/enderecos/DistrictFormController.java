
package controllers.enderecos;

import controllers.builders.enderecos.DistrictBuilder;
import controllers.patterns.AbstractFormController;
import controllers.patterns.ModelBuilderException;
import models.enderecos.District;
import repositories.enderecos.DistrictRepository;
import view.DistrictFormComponent;


public class DistrictFormController extends AbstractFormController<DistrictFormComponent, District>{
    
    private DistrictRepository repository;
    
    public DistrictFormController(DistrictFormComponent form) {
        super(form);
        
        this.repository = new DistrictRepository();
    }
    
    private DistrictBuilder newDistrictBuilder(){
        return new DistrictBuilder()
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
    protected void onClickButtonCreate(){
        try {
            int id = this.repository.nextID();
            
            District district = this.newDistrictBuilder().build(id);
            
            this.repository.create(district);
            
            System.out.println("Bairro cadastrado com sucesso!");
            
        } catch (ModelBuilderException ex) {
            System.out.println("Falha ao cadastrar Bairro\nErro: " + ex.getMessage());
        }
        
      
    }

    @Override
    protected void onClickButtonUpdate() {
        try {
            int id = this.registerLoaded.getId();
            
            District district = this.newDistrictBuilder().build(id);
            
            this.repository.update(id, district);
            
            System.out.println("Bairro alterado com sucesso!");
            
        } catch (ModelBuilderException ex) {
            System.out.println("Falha ao atualizar Bairro\nErro: " + ex.getMessage());
        }
    }

    @Override
    protected void initStates() {
        
    }

    
}
