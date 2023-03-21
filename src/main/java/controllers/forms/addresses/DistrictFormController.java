
package controllers.forms.addresses;

import controllers.builders.enderecos.DistrictBuilder;
import controllers.patterns.AbstractFormController;
import controllers.patterns.ModelBuilderException;
import models.enderecos.District;
import repositories.enderecos.DistrictRepository;
import view.forms.DistrictFormComponent;


public class DistrictFormController extends AbstractFormController<DistrictFormComponent, District>{
    
    private final DistrictRepository repository = new DistrictRepository();
    
    public DistrictFormController() {
        super(new DistrictFormComponent());
    }
    
    private DistrictBuilder newDistrictBuilder(){
        return new DistrictBuilder()
                    .setDescricao(this.form.getjTextFieldDescription().getText());
    }
    
    private void createDistrict(){
        try {
            int id = this.repository.nextID();
            
            District district = this.newDistrictBuilder().build(id);
            
            this.repository.create(district);
            
            System.out.println("Bairro cadastrado com sucesso!");
            
        } catch (ModelBuilderException ex) {
            System.out.println("Falha ao cadastrar Bairro\nErro: " + ex.getMessage());
        }
    }
    
    private void updateDistrict(){
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
    protected void resetStates() {
        this.form.getjTextFieldDescription().setText(null);
        
        this.form.getjTextFieldDescription().setEnabled(false);
    }
    
    @Override
    protected void onClickButtonNew() {
       this.form.getjTextFieldDescription().setEnabled(true);
    }
    
    @Override
    protected void onClickButtonWrite(){
        if(this.registerLoaded == null)
            this.createDistrict();
        
        else
            this.updateDistrict();
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
