
package controllers.pessoas;

import controllers.builders.pessoa.SupplierBuilder;
import controllers.patterns.AbstractFormPersonController;
import java.util.ArrayList;
import models.pessoas.Supplier;
import repositories.pessoas.SupplierRepository;
import view.SupplierFormComponent;
import view.utils.UtilsComponents;


public class SupplierFormController extends AbstractFormPersonController<SupplierFormComponent, Supplier>{
    
    private final SupplierRepository supplierRepository = new SupplierRepository();
    
    private SupplierBuilder newSupplierBuilder(){
        return (SupplierBuilder) new SupplierBuilder()
                                    .setCnpj(this.form.getjTextFieldCnpj().getText())
                                    .setCpf(this.form.getjTextFieldCpf().getText())
                                    .setContato(this.form.getjTextFieldContact().getText())
                                    .setInscricaoEstadual(this.form.getjTextFieldIe().getText())
                                    .setEmail(this.form.getjTextFieldEmail().getText())
                                    .setNome(this.form.getjTextFieldName().getText())
                                    .setStatus('A')
                                    .setTelefones(this.form.getjTextFieldPhone1().getText(), this.form.getjTextFieldPhone2().getText())
                                    .setComplementoEndereco(this.form.getjTextFieldStreet().getText())
                                    .setObservacao(this.form.getjTextAreaObs().getText())
                                    .setEndereco(this.addressLocated);
    }
    
    public SupplierFormController(SupplierFormComponent form) {
        super(form);
    }

    @Override
    protected void initStates() {
        
    }

    @Override
    protected void resetStates() {
        this.form.activateButtons(false);
        
        ArrayList<javax.swing.JComponent> fields =  new ArrayList();
        ArrayList<javax.swing.text.JTextComponent> textFields =  new ArrayList();
        
        fields.add(this.form.getjTextFieldCnpj());
        fields.add(this.form.getjTextFieldCpf());
        fields.add(this.form.getjTextFieldContact());
        fields.add(this.form.getjTextFieldIe());
        
        textFields.add(this.form.getjTextFieldCnpj());
        textFields.add(this.form.getjTextFieldCpf());
        textFields.add(this.form.getjTextFieldContact());
        textFields.add(this.form.getjTextFieldIe());
        
        UtilsComponents.disabledComponents(fields, false);
        UtilsComponents.clearFields(textFields);
        
        this.form.getjLabelStatus().setText(" ");
    }

    @Override
    protected void onClickButtonNew() {
        this.form.activateButtons(true);
        
        ArrayList<javax.swing.JComponent> fields =  new ArrayList();
        ArrayList<javax.swing.text.JTextComponent> textFields =  new ArrayList();
        
        fields.add(this.form.getjTextFieldCnpj());
        fields.add(this.form.getjTextFieldCpf());
        fields.add(this.form.getjTextFieldContact());
        fields.add(this.form.getjTextFieldIe());
        
        textFields.add(this.form.getjTextFieldCnpj());
        textFields.add(this.form.getjTextFieldCpf());
        textFields.add(this.form.getjTextFieldContact());
        textFields.add(this.form.getjTextFieldIe());
        
        UtilsComponents.disabledComponents(fields, true);
        UtilsComponents.clearFields(textFields);
        
        this.form.getjLabelStatus().setText("ATIVO");
    }

    @Override
    protected void onClickButtonCreate() {
       try{
           
           int id = this.supplierRepository.nextID();
           
           Supplier supplier = this.newSupplierBuilder().build(id);
           
           this.supplierRepository.create(supplier);
           
           System.out.println("Fornecedor cadastrado com sucesso!");
           
       }catch(Exception error){
           System.out.println("Falha ao cadastrar Fornecedor!\nErro: " + error.getMessage());
       }
    }

    @Override
    protected void onClickButtonUpdate() {
        try{
           
           int id = this.registerLoaded.getId();
           
           Supplier supplier = this.newSupplierBuilder().build(id);
           
           this.supplierRepository.update(id, supplier);
           
           System.out.println("Fornecedor alterado com sucesso!");
           
       }catch(Exception error){
           System.out.println("Falha ao alterar Fornecedor!\nErro: " + error.getMessage());
       }
    }
    
}
