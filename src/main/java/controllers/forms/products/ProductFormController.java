
package controllers.forms.products;

import controllers.builders.produtos.ProductBuilder;
import controllers.patterns.AbstractFormController;

import java.util.ArrayList;

import models.products.Product;
import models.products.Brand;
import models.products.Class;
import repositories.products.BrandRepository;
import repositories.products.ClassRepository;
import repositories.products.ProductRepository;
import view.forms.ProductFormComponent;
import view.utils.UtilsComponents;

import javax.swing.*;


public class ProductFormController extends AbstractFormController<ProductFormComponent, Product> {

    private final ProductRepository productRepository = new ProductRepository();
    private ArrayList<Class> classes;
    private ArrayList<Brand> brands;

    public ProductFormController() {
        super(new ProductFormComponent());
    }

    private ProductBuilder newProductBuilder() {
        Class class_ = null;
        Brand brand = null;

        if (!this.brands.isEmpty())
            brand = this.brands.get(this.form.getjComboBoxBrand().getSelectedIndex());

        if (!this.classes.isEmpty())
            class_ = this.classes.get(this.form.getjComboBoxClass().getSelectedIndex());

        try {
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

        } catch (Exception error) {
            JOptionPane.showMessageDialog(this.form, error.getMessage(), "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    private void createProduct() {
        ProductBuilder productBuilder = this.newProductBuilder();

        if (productBuilder == null) return;

        Product product = productBuilder.build();

        try {
            this.productRepository.create(product);

            JOptionPane.showMessageDialog(this.form, "Produto cadastrado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao cadastrar produto!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateProduct() {
        ProductBuilder productBuilder = this.newProductBuilder();

        if (productBuilder == null) return;

        try {
            int id = this.registerLoaded.getId();

            Product product = (Product) productBuilder.setId(id).build();

            this.productRepository.update(product);

            JOptionPane.showMessageDialog(this.form, "Produto alterado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao alterar produto!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void enabledFields(boolean status) {
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

    private void clearFields() {
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

    private void loadFieldsProduct() {
        if (this.registerLoaded == null) return;

        if (!this.brands.isEmpty() || this.registerLoaded.getMarca() != null) {
            for (int brandIndex = 0; brandIndex < this.brands.size(); brandIndex++) {

                Brand brand = this.brands.get(brandIndex);

                if (brand.getId() == this.registerLoaded.getMarca().getId())
                    this.form.getjComboBoxBrand().setSelectedIndex(brandIndex);
            }
        }

        if (!this.classes.isEmpty() || this.registerLoaded.getClass() != null) {
            for (int classIndex = 0; classIndex < this.classes.size(); classIndex++) {

                Class class_ = this.classes.get(classIndex);

                if (class_.getId() == this.registerLoaded.getClasse().getId())
                    this.form.getjComboBoxClass().setSelectedIndex(classIndex);
            }
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
        try {
            if (this.form.getjComboBoxBrand().getItemCount() > 0)
                this.form.getjComboBoxBrand().removeAllItems();

            if (this.form.getjComboBoxClass().getItemCount() > 0)
                this.form.getjComboBoxClass().removeAllItems();

            ClassRepository classRepository = new ClassRepository();
            BrandRepository brandRepository = new BrandRepository();

            this.classes = (ArrayList<Class>) classRepository.fetch();
            this.brands = (ArrayList<Brand>) brandRepository.fetch();

            for (Brand b : this.brands)
                this.form.getjComboBoxBrand().addItem(b.getDescricao());

            for (Class c : this.classes)
                this.form.getjComboBoxClass().addItem(c.getDescricao());

            this.form.getjLabelStatus().setText(" ");

            loadFieldsProduct();

        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
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
        if (this.registerLoaded == null)
            this.createProduct();
        else
            this.updateProduct();
    }

    @Override
    protected void onClickButtonChange() {
        this.enabledFields(true);
    }

}
