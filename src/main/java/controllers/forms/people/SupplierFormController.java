
package controllers.forms.people;

import controllers.builders.pessoa.SupplierBuilder;
import controllers.patterns.AbstractFormPersonController;
import controllers.patterns.ModelBuilderException;
import models.people.Supplier;
import repositories.people.SupplierRepository;
import view.forms.SupplierFormComponent;

import javax.swing.*;


public class SupplierFormController extends AbstractFormPersonController<SupplierFormComponent, Supplier> {

    private final SupplierRepository supplierRepository = new SupplierRepository();

    private SupplierBuilder newSupplierBuilder() {
        try {
            return (SupplierBuilder) new SupplierBuilder()
                    .setCnpj(this.form.getjTextFieldCnpj().getText())
                    .setCpf(this.form.getjTextFieldCpf().getText())
                    .setContato(this.form.getjTextFieldContact().getText())
                    .setInscricaoEstadual(this.form.getjTextFieldIe().getText())
                    .setRazaoSocial(this.form.getjTextFieldSocialReason().getText())
                    .setEmail(this.form.getjTextFieldEmail().getText())
                    .setNome(this.form.getjTextFieldName().getText())
                    .setStatus('A')
                    .setTelefones(this.form.getjTextFieldPhone1().getText(), this.form.getjTextFieldPhone2().getText())
                    .setComplementoEndereco(this.form.getjTextFieldStreet().getText())
                    .setObservacao(this.form.getjTextAreaObs().getText())
                    .setEndereco(this.addressLoaded);

        } catch (ModelBuilderException error) {
            JOptionPane.showMessageDialog(this.form, error.getMessage(), "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    public SupplierFormController() {
        super(new SupplierFormComponent());
    }

    private void createSupplier() {
        SupplierBuilder supplierBuilder = this.newSupplierBuilder();

        if (supplierBuilder == null) return;

        Supplier supplier = supplierBuilder.build();

        try {
            this.supplierRepository.create(supplier);

            JOptionPane.showMessageDialog(this.form, "Fornecedor cadastrado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao cadastrar Fornecedor!\nERRRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void updateSupplier() {

        SupplierBuilder supplierBuilder = this.newSupplierBuilder();

        if (supplierBuilder == null) return;

        try {
            int id = this.registerLoaded.getId();

            Supplier supplier = (Supplier) supplierBuilder.setId(id).build();

            this.supplierRepository.update(id, supplier);

            JOptionPane.showMessageDialog(this.form, "Fornecedor alterado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao alterar Fornecedor!\nERRRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void clearFieldsSupplier() {
        this.clearFields();

        this.form.getjTextFieldCnpj().setText("");
        this.form.getjTextFieldCpf().setText("");
        this.form.getjTextFieldContact().setText("");
        this.form.getjTextFieldIe().setText("");
        this.form.getjTextFieldSocialReason().setText("");
    }

    private void enabledFieldsSupplier(boolean status) {

        this.enabledFields(status);

        this.form.getjTextFieldIe().setEnabled(status);
        this.form.getjTextFieldContact().setEnabled(status);
        this.form.getjTextFieldCpf().setEnabled(status);
        this.form.getjTextFieldCnpj().setEnabled(status);
        this.form.getjTextFieldSocialReason().setEnabled(status);
    }

    @Override
    protected void onShowComponent() {
        if (this.registerLoaded == null) return;

        this.loadFields();

        this.form.getjTextFieldCnpj().setText(this.registerLoaded.getCnpj());
        this.form.getjTextFieldContact().setText(this.registerLoaded.getContato());
        this.form.getjTextFieldCpf().setText(this.registerLoaded.getCpf());
        this.form.getjTextFieldIe().setText(this.registerLoaded.getInscricaoEstadual());
        this.form.getjTextFieldSocialReason().setText(this.registerLoaded.getRazaoSocial());
    }

    @Override
    protected void resetStates() {
        this.clearFieldsSupplier();
        this.enabledFieldsSupplier(false);

        this.form.getjLabelStatus().setText(" ");
    }

    @Override
    protected void onClickButtonNew() {
        this.clearFieldsSupplier();
        this.enabledFieldsSupplier(true);

        this.form.getjLabelStatus().setText("ATIVO");
    }

    @Override
    protected void onClickButtonWrite() {
        if (this.registerLoaded == null)
            this.createSupplier();
        else
            this.updateSupplier();
    }

    @Override
    protected void onClickButtonChange() {
        this.enabledFieldsSupplier(true);
    }

}
