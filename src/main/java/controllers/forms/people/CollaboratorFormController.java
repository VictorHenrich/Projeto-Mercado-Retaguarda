
package controllers.forms.people;

import controllers.builders.pessoa.CollaboratorBuilder;
import controllers.patterns.AbstractFormPersonController;
import java.util.ArrayList;
import models.pessoas.Collaborator;
import repositories.pessoas.CollaboratorRepository;
import view.forms.CollaboratorFormComponent;
import view.utils.UtilsComponents;


public class CollaboratorFormController extends AbstractFormPersonController<CollaboratorFormComponent, Collaborator>{
    
    private final CollaboratorRepository collaboratorRepository;
    
    public CollaboratorFormController() {
        super(new CollaboratorFormComponent());
        
        this.collaboratorRepository = new CollaboratorRepository();
    }
    
    private CollaboratorBuilder newCollaboratorBuilder(){
        return (CollaboratorBuilder) 
                    new CollaboratorBuilder()
                        .setLogin(this.form.getjTextFieldUser().getText())
                        .setSenha(this.form.getjTextFieldPassword().getText())
                        .setEmail(this.form.getjTextFieldEmail().getText())
                        .setNome(this.form.getjTextFieldName().getText())
                        .setStatus('A')
                        .setTelefones(this.form.getjTextFieldPhone1().getText(), this.form.getjTextFieldPhone2().getText())
                        .setComplementoEndereco(this.form.getjTextFieldStreet().getText())
                        .setObservacao(this.form.getjTextAreaObs().getText())
                        .setEndereco(this.addressLoaded);
    }
    
    private void createCollaborator(){
        try{
           int id = this.collaboratorRepository.nextID();
           
           Collaborator collaborator = this.newCollaboratorBuilder().build(id);
           
           this.collaboratorRepository.create(collaborator);
           
           System.out.println("Colaborador cadastro com sucesso!");
           
       }catch(Exception error){
           System.out.println("Erro ao cadastrar colaborador!\nErro: " + error.getMessage());
       }
    }
    
    private void updateCollaborator(){
        try{
            Collaborator collaborator = this.newCollaboratorBuilder().build(this.registerLoaded.getId());
            
            this.collaboratorRepository.update(this.registerLoaded.getId(), collaborator);
            
            System.out.println("Colaborador alterado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Erro ao alterar colaborador!\nErro: " + error.getMessage());
        }
    }
    
    private void clearFields(){
        ArrayList<javax.swing.text.JTextComponent> textFields =  new ArrayList();
        
        textFields.add(this.form.getjTextFieldPassword());
        textFields.add(this.form.getjTextFieldUser());
        
        UtilsComponents.clearFields(textFields);
    }
    
    private void enabledFieldsCollaborator(boolean status){
        this.form.getjTextFieldPassword().setEnabled(status);
        this.form.getjTextFieldUser().setEnabled(status);
        
        this.enabledFields(status);
    }
    
    @Override
    protected void resetStates() {
        this.clearFields();
        this.enabledFieldsCollaborator(false);
        
        this.form.getjLabelStatus().setText(" ");
    }

    @Override
    protected void onClickButtonNew() {
        this.form.activateFieldsPerson(true);
        
        this.clearFields();
        this.enabledFieldsCollaborator(true);
        
        this.form.getjLabelStatus().setText("ATIVO");
    }

    @Override
    protected void onClickButtonWrite() {
       if(this.registerLoaded == null)
           this.createCollaborator();
       
       else
           this.updateCollaborator();
           
    }

    @Override
    protected void onClickButtonChange() {
        this.enabledFieldsCollaborator(true);
    }

    @Override
    protected void onShowComponent() {
        if(this.registerLoaded == null) return;
        
        this.loadFields();
        
        this.form.getjTextFieldUser().setText(this.registerLoaded.getLogin());
        this.form.getjTextFieldPassword().setText(this.registerLoaded.getSenha());
    }
    
}
