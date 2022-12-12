
package controllers.pessoas;

import controllers.builders.pessoa.CollaboratorBuilder;
import controllers.patterns.AbstractFormPersonController;
import java.util.ArrayList;
import models.enderecos.Address;
import models.enderecos.City;
import models.enderecos.District;
import models.pessoas.Collaborator;
import repositories.pessoas.CollaboratorRepository;
import view.CollaboratorFormComponent;
import view.utils.UtilsComponents;


public class CollaboratorFormController extends AbstractFormPersonController<CollaboratorFormComponent, Collaborator>{
    
    private final CollaboratorRepository collaboratorRepository;
    private Collaborator collaboratorLoaded = null;
    
    public CollaboratorFormController(CollaboratorFormComponent form, ArrayList<City> cities, ArrayList<District> districts, ArrayList<Address> addresses) {
        super(form, cities, districts, addresses);
        
        this.collaboratorRepository = new CollaboratorRepository(this.registers);
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
                        .setEndereco(this.addressLocated);
    }
    
    @Override
    protected void resetStates() {
        this.form.activateFieldsPerson(false);
        
        ArrayList<javax.swing.JComponent> fields =  new ArrayList();
        ArrayList<javax.swing.text.JTextComponent> textFields =  new ArrayList();
        
        fields.add(this.form.getjTextFieldPassword());
        fields.add(this.form.getjTextFieldUser());
        
        textFields.add(this.form.getjTextFieldPassword());
        textFields.add(this.form.getjTextFieldUser());
        
        UtilsComponents.disabledComponents(fields, false);
        UtilsComponents.clearFields(textFields);
    }

    @Override
    protected void initStates() {
        this.form.activateFieldsPerson(true);
        
        ArrayList<javax.swing.JComponent> fields =  new ArrayList();
        ArrayList<javax.swing.text.JTextComponent> textFields =  new ArrayList();
        
        fields.add(this.form.getjTextFieldPassword());
        fields.add(this.form.getjTextFieldUser());
        
        textFields.add(this.form.getjTextFieldPassword());
        textFields.add(this.form.getjTextFieldUser());
        
        UtilsComponents.disabledComponents(fields, true);
        UtilsComponents.clearFields(textFields);
        
        this.form.getjLabelStatus().setText("ATIVO");
    }

    @Override
    protected void create() {
       try{
           int id = this.collaboratorRepository.nextID();
           
           Collaborator collaborator = this.newCollaboratorBuilder().build(id);
           
           this.collaboratorRepository.create(collaborator);
           
           System.out.println("Colaborador cadastro com sucesso!");
           
       }catch(Exception error){
           System.out.println("Erro ao cadastrar colaborador!\nErro: " + error.getMessage());
       }
           
    }

    @Override
    protected void update() {
        try{
            Collaborator collaborator = this.newCollaboratorBuilder().build(this.collaboratorLoaded.getId());
            
            this.collaboratorRepository.update(this.collaboratorLoaded.getId(), collaborator);
            
            System.out.println("Colaborador alterado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Erro ao alterar colaborador!\nErro: " + error.getMessage());
        }
    }
    
}
