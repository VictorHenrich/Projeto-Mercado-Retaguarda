
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
    private ArrayList<Class> listClasses;
    private ArrayList<Brand> listBrands;
    
    public ProductFormController(ProductFormComponent form) {
        super(form);
    }
    
    private ProductBuilder newProductBuilder(){
        Class class_ = this.listClasses.get(this.form.getjComboBoxClass().getSelectedIndex());
        Brand brand = this.listBrands.get(this.form.getjComboBoxBrand().getSelectedIndex());
        
        return new ProductBuilder()
                    .setDescricao(this.form.getjTextFieldDescription().getText())
                    .setBarraEntrada(this.form.getjTextFieldBarcode().getText())
                    .setBarraSaida(this.form.getjTextFieldBarcode().getText())
                    .setEstoqueMaximo(Float.parseFloat(this.form.getjTextFieldMaxStock().getText()))
                    .setEstoqueMinimo(Float.parseFloat(this.form.getjTextFieldMinStock().getText()))
                    .setStatus('A')
                    .setValorCompra(Float.parseFloat(this.form.getjTextFieldBuyingValue().getText()))
                    .setValorVenda(Float.parseFloat(this.form.getjTextFieldSaleValue().getText()))
                    .setUnidadeCompra(this.form.getjTextFieldUnBuying().getText())
                    .setUnidadeVenda(this.form.getjTextFieldUnSales().getText())
                    .setClasse(class_)
                    .setMarca(brand);
    }

    @Override
    protected void initStates() {
        ClassRepository classRepository = new ClassRepository();
        BrandRepository brandRepository = new BrandRepository();
        
        this.listClasses = (ArrayList<Class>) classRepository.fetch();
        this.listBrands = (ArrayList<Brand>) brandRepository.fetch();
        
        for(Brand b: this.listBrands)
            this.form.getjComboBoxBrand().addItem(b.getDescricao());
        
        for(Class c: this.listClasses)
            this.form.getjComboBoxBrand().addItem(c.getDescricao());
    }

    @Override
    protected void resetStates() {
        ArrayList<javax.swing.JComponent> fields = new ArrayList();
        ArrayList<javax.swing.text.JTextComponent> textFields = new ArrayList();
        
        fields.add(this.form.getjTextFieldDescription());
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
        
        textFields.add(this.form.getjTextFieldDescription());
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
        
        fields.add(this.form.getjTextFieldDescription());
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
        
        textFields.add(this.form.getjTextFieldDescription());
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