
package controllers.forms.products;

import controllers.builders.produtos.ProductBuilder;
import controllers.patterns.AbstractFormController;
import java.text.ParseException;
import java.util.ArrayList;
import models.produtos.Product;
import models.produtos.Brand;
import models.produtos.Class;
import repositories.produtos.BrandRepository;
import repositories.produtos.ClassRepository;
import repositories.produtos.ProductRepository;
import view.forms.ProductFormComponent;
import view.utils.UtilsComponents;


public class ProductFormController extends AbstractFormController<ProductFormComponent, Product>{
    
    private final ProductRepository productRepository = new ProductRepository();
    private ArrayList<Class> classes;
    private ArrayList<Brand> brands;
    
    public ProductFormController() {
        super(new ProductFormComponent());
    }
    
    private ProductBuilder newProductBuilder(){
        Class class_ = null;
        Brand brand = null;
        
        if(!this.brands.isEmpty())
            brand = this.brands.get(this.form.getjComboBoxBrand().getSelectedIndex());
        
        if(!this.classes.isEmpty())
            class_ = this.classes.get(this.form.getjComboBoxClass().getSelectedIndex());
            
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
    
    private void createProduct(){
        try{
            
            int id = this.productRepository.nextID();
            
            Product product = this.newProductBuilder().build(id);
            
            this.productRepository.create(product);
            
            System.out.println("Produto cadastrado com sucesso!");
            
            
        }catch(Exception error){
            if(error instanceof NumberFormatException)
                System.out.println("Campos numéricos foram preenchidos com valores incorretos!");
            
            else
                System.out.println("Falha ao cadastrar produto!\nErro: " + error.getMessage());
        }
    }
    
    private void updateProduct(){
        try{
            
            int id = this.registerLoaded.getId();
            
            Product product = this.newProductBuilder().build(id);
            
            this.productRepository.update(id, product);
            
            System.out.println("Produto alterado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao alterar produto!\nErro: " + error.getMessage());
        }
    }

    private void enabledFields(boolean status){
        ArrayList<javax.swing.JComponent> fields = new ArrayList();
        
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
        
        UtilsComponents.disabledComponents(fields, !status);
    }
    
    private void clearFields(){
        ArrayList<javax.swing.text.JTextComponent> fields = new ArrayList();
        
        fields.add(this.form.getjTextFieldDescription());
        fields.add(this.form.getjTextFieldBarcode());
        fields.add(this.form.getjTextFieldBuyingValue());
        fields.add(this.form.getjTextFieldDescription());
        fields.add(this.form.getjTextFieldMaxStock());
        fields.add(this.form.getjTextFieldMinStock());
        fields.add(this.form.getjTextFieldSaleValue());
        fields.add(this.form.getjTextFieldUnBuying());
        fields.add(this.form.getjTextFieldUnSales());
        
        UtilsComponents.clearFields(fields);
    }
    
    private void loadFieldsProduct(){
        if(this.registerLoaded == null) return;
        
        if(!this.brands.isEmpty() || this.registerLoaded.getMarca() != null){
            int indexBrandSelected = this.brands.indexOf(this.registerLoaded.getMarca());
            
            this.form.getjComboBoxBrand().setSelectedIndex(indexBrandSelected);
        }
        
        if(!this.classes.isEmpty() || this.registerLoaded.getClass() != null){
            int indexClassSelected = this.classes.indexOf(this.registerLoaded.getClasse());
            
            this.form.getjComboBoxClass().setSelectedIndex(indexClassSelected);
        }
        
        this.form.getjTextFieldDescription().setText(this.registerLoaded.getDescricao());
        this.form.getjTextFieldBarcode().setText(this.registerLoaded.getBarraEntrada());
        this.form.getjTextFieldBuyingValue().setText("" + this.registerLoaded.getValorCompra());
        this.form.getjTextFieldSaleValue().setText("" + this.registerLoaded.getValorVenda());
        this.form.getjTextFieldUnBuying().setText(this.registerLoaded.getUnidadeCompra());
        this.form.getjTextFieldUnSales().setText(this.registerLoaded.getUnidadeVenda());
        this.form.getjTextFieldMaxStock().setText("" + this.registerLoaded.getEstoqueMaximo());
        this.form.getjTextFieldMinStock().setText("" + this.registerLoaded.getEstoqueMaximo());
        
        String status = this.registerLoaded.getStatus() == 'A' ? "ATIVO" : "INATIVO";
        
        this.form.getjLabelStatus().setText(status);
    }
    
    @Override
    protected void onShowComponent() {
        if(this.form.getjComboBoxBrand().getItemCount() > 0)
            this.form.getjComboBoxBrand().removeAllItems();
        
        if(this.form.getjComboBoxClass().getItemCount() > 0)
            this.form.getjComboBoxClass().removeAllItems();
        
        ClassRepository classRepository = new ClassRepository();
        BrandRepository brandRepository = new BrandRepository();
        
        this.classes = (ArrayList<Class>) classRepository.fetch();
        this.brands = (ArrayList<Brand>) brandRepository.fetch();
        
        for(Brand b: this.brands)
            this.form.getjComboBoxBrand().addItem(b.getDescricao());
        
        for(Class c: this.classes)
            this.form.getjComboBoxClass().addItem(c.getDescricao());
        
        this.form.getjLabelStatus().setText(" ");
        
        loadFieldsProduct();
    }

    @Override
    protected void resetStates() {
        this.clearFields();
        this.enabledFields(false);
        
        this.form.getjLabelStatus().setText(" ");
    }

    @Override
    protected void onClickButtonNew() {        
        this.clearFields();
        this.enabledFields(true);
        
        this.form.getjLabelStatus().setText("ATIVO");
    }

    @Override
    protected void onClickButtonWrite() {
        if(this.registerLoaded == null)
            this.createProduct();
        else
            this.updateProduct();
    }

    @Override
    protected void onClickButtonChange() {
        this.enabledFields(true);
    }
    
}
