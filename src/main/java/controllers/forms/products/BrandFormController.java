
package controllers.forms.products;

import controllers.builders.produtos.BrandBuilder;
import controllers.patterns.AbstractFormController;
import models.produtos.Brand;
import repositories.produtos.BrandRepository;
import view.forms.BrandFormComponent;


public class BrandFormController extends AbstractFormController<BrandFormComponent, Brand>{
    
    private final BrandRepository brandRepository = new BrandRepository();
    
    public BrandFormController() {
        super(new BrandFormComponent());
    }
    
    private BrandBuilder newBrandBuilder(){
        return new BrandBuilder()
                    .setDescricao(this.form.getjTextFieldDescription().getText());
    }

    @Override
    protected void initStates() {
        
    }

    @Override
    protected void resetStates() {
        this.form.getjTextFieldDescription().setEnabled(false);
        this.form.getjTextFieldDescription().setText("");
    }

    @Override
    protected void onClickButtonNew() {
       this.form.getjTextFieldDescription().setEnabled(true);
       this.form.getjTextFieldDescription().setText("");
    }

    @Override
    protected void onClickButtonCreate() {
        try{
            
            int id = this.brandRepository.nextID();
            
            Brand brand = this.newBrandBuilder().build(id);
            
            this.brandRepository.create(brand);
            
            System.out.println("Marca cadastrada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar marca!\nErro: " + error.getMessage());
        }
    }

    @Override
    protected void onClickButtonUpdate() {
        try{
            
            int id = this.registerLoaded.getId();
            
            Brand brand = this.newBrandBuilder().build(id);
            
            this.brandRepository.update(id, brand);
            
            System.out.println("Marca alterada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao alterar marca!\nErro: " + error.getMessage());
        }
    }
    
}
