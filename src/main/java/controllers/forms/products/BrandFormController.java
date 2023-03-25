
package controllers.forms.products;

import controllers.builders.produtos.BrandBuilder;
import controllers.patterns.AbstractFormController;
import models.products.Brand;
import repositories.products.BrandRepository;
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
    
    private void createBrand(){
        try{
            
            int id = this.brandRepository.nextID();
            
            Brand brand = this.newBrandBuilder().build(id);
            
            this.brandRepository.create(brand);
            
            System.out.println("Marca cadastrada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar marca!\nErro: " + error.getMessage());
        }
    }
    
    private void updateBrand(){
        try{
            
            int id = this.registerLoaded.getId();
            
            Brand brand = this.newBrandBuilder().build(id);
            
            this.brandRepository.update(id, brand);
            
            System.out.println("Marca alterada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao alterar marca!\nErro: " + error.getMessage());
        }
    }

    @Override
    protected void onShowComponent() {
        if(this.registerLoaded == null) return;
        
        this.form.getjTextFieldDescription().setText(this.registerLoaded.getDescricao());
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
    protected void onClickButtonWrite() {
        if(this.registerLoaded == null)
            this.createBrand();
        else
            this.updateBrand();
    }

    @Override
    protected void onClickButtonChange() {
        this.form.getjTextFieldDescription().setEnabled(true);
    }
    
}
