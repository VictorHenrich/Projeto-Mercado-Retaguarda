
package controllers.produtos;

import controllers.builders.produtos.ProductBuilder;
import controllers.patterns.AbstractFormController;
import java.util.ArrayList;
import models.produtos.Product;
import models.produtos.Brand;
import models.produtos.Class;
import repositories.produtos.BrandRepository;
import repositories.produtos.ClassRepository;
import repositories.produtos.ProductRepository;
import view.ProductFormComponent;
import view.utils.UtilsComponents;


public class ProductFormController extends AbstractFormController<ProductFormComponent, Product>{
    
    private final ProductRepository productRepository = new ProductRepository();
    
    public ProductFormController(ProductFormComponent form) {
        super(form);
    }
    
    private ProductBuilder newProductBuilder(){
        return new ProductBuilder();
    }

    @Override
    protected void initStates() {
        ClassRepository classRepository = new ClassRepository();
        BrandRepository brandRepository = new BrandRepository();
        
        for(Brand b: brandRepository.fetch())
            this.form.getjComboBoxBrand().addItem(b.getDescricao());
        
        for(Class c: classRepository.fetch())
            this.form.getjComboBoxBrand().addItem(c.getDescricao());
    }

    @Override
    protected void resetStates() {
        ArrayList<javax.swing.JComponent> fields = new ArrayList();
        ArrayList<javax.swing.text.JTextComponent> textFields = new ArrayList();
        
        fields.add(this.form.getjTextFieldBarcode());
        fields.add(this.form.getjTextFieldBuyingValue());
        fields.add(this.form.getjTextFieldDescription());
        fields.add(this.form.getjTextFieldMaxStock());
        fields.add(this.form.getjTextFieldMinStock());
        fields.add(this.form.getjTextFieldSaleValue());
        fields.add(this.form.getjTextFieldUnBuying());
        fields.add(this.form.getjTextFieldUnSales());
        fields.add(this.form.getjComboBoxBrand());
        fields.add(this.form.getjComboBoxClass());
        
        textFields.add(this.form.getjTextFieldBarcode());
        textFields.add(this.form.getjTextFieldBuyingValue());
        textFields.add(this.form.getjTextFieldDescription());
        textFields.add(this.form.getjTextFieldMaxStock());
        textFields.add(this.form.getjTextFieldMinStock());
        textFields.add(this.form.getjTextFieldSaleValue());
        textFields.add(this.form.getjTextFieldUnBuying());
        textFields.add(this.form.getjTextFieldUnSales());
        
        UtilsComponents.clearFields(textFields);
        UtilsComponents.disabledComponents(fields, true);
    }

    @Override
    protected void onClickButtonNew() {
        ArrayList<javax.swing.JComponent> fields = new ArrayList();
        ArrayList<javax.swing.text.JTextComponent> textFields = new ArrayList();
        
        fields.add(this.form.getjTextFieldBarcode());
        fields.add(this.form.getjTextFieldBuyingValue());
        fields.add(this.form.getjTextFieldDescription());
        fields.add(this.form.getjTextFieldMaxStock());
        fields.add(this.form.getjTextFieldMinStock());
        fields.add(this.form.getjTextFieldSaleValue());
        fields.add(this.form.getjTextFieldUnBuying());
        fields.add(this.form.getjTextFieldUnSales());
        fields.add(this.form.getjComboBoxBrand());
        fields.add(this.form.getjComboBoxClass());
        
        textFields.add(this.form.getjTextFieldBarcode());
        textFields.add(this.form.getjTextFieldBuyingValue());
        textFields.add(this.form.getjTextFieldDescription());
        textFields.add(this.form.getjTextFieldMaxStock());
        textFields.add(this.form.getjTextFieldMinStock());
        textFields.add(this.form.getjTextFieldSaleValue());
        textFields.add(this.form.getjTextFieldUnBuying());
        textFields.add(this.form.getjTextFieldUnSales());
        
        UtilsComponents.clearFields(textFields);
        UtilsComponents.disabledComponents(fields, false);
    }

    @Override
    protected void onClickButtonCreate() {
        try{
            
            int id = this.productRepository.nextID();
            
            Product product = this.newProductBuilder().build(id);
            
            this.productRepository.create(product);
            
            System.out.println("Produto cadastrado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar produto!\nErro: " + error.getMessage());
        }
    }

    @Override
    protected void onClickButtonUpdate() {
        try{
            
            int id = this.registerLoaded.getId();
            
            Product product = this.newProductBuilder().build(id);
            
            this.productRepository.update(id, product);
            
            System.out.println("Produto alterado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao alterar produto!\nErro: " + error.getMessage());
        }
    }
    
}
