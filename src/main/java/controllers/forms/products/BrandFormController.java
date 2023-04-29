
package controllers.forms.products;

import controllers.builders.produtos.BrandBuilder;
import controllers.patterns.AbstractFormController;
import models.products.Brand;
import repositories.products.BrandRepository;
import view.forms.BrandFormComponent;

import javax.swing.*;


public class BrandFormController extends AbstractFormController<BrandFormComponent, Brand> {

    private final BrandRepository brandRepository = new BrandRepository();

    public BrandFormController() {
        super(new BrandFormComponent());
    }

    private BrandBuilder newBrandBuilder() {
        try {
            return new BrandBuilder()
                    .setDescricao(this.form.getjTextFieldDescription().getText());

        } catch (Exception error) {
            JOptionPane.showMessageDialog(this.form, error.getMessage(), "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    private void createBrand() {
        BrandBuilder brandBuilder = this.newBrandBuilder();

        if (brandBuilder == null) return;

        Brand brand = brandBuilder.build();

        try {
            this.brandRepository.create(brand);

            JOptionPane.showMessageDialog(this.form, "Marca cadastrada com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao cadastrar Marca!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateBrand() {

        BrandBuilder brandBuilder = this.newBrandBuilder();

        if (brandBuilder == null) return;

        try {

            int id = this.registerLoaded.getId();

            Brand brand = (Brand) brandBuilder.setId(id).build();

            this.brandRepository.update(id, brand);

            JOptionPane.showMessageDialog(this.form, "Marca alterado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao alterar Marca!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    protected void onShowComponent() {
        if (this.registerLoaded == null) return;

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
        if (this.registerLoaded == null)
            this.createBrand();
        else
            this.updateBrand();
    }

    @Override
    protected void onClickButtonChange() {
        this.form.getjTextFieldDescription().setEnabled(true);
    }

}
