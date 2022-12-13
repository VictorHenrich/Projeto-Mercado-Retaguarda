
package controllers.pessoas;

import controllers.builders.pessoa.ClientBuilder;
import controllers.patterns.AbstractFormPersonController;
import controllers.patterns.ModelBuilderException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import models.pessoas.Client;
import models.pessoas.Sex;
import repositories.pessoas.ClientRepository;
import view.ClientFormComponent;
import view.utils.UtilsComponents;


public class ClientFormController extends AbstractFormPersonController<ClientFormComponent, Client>{
    
    private final ClientRepository clientRepository;
    private ArrayList<Sex> sexes;
    
    public ClientFormController(ClientFormComponent form) {
        super(form);
        
        this.clientRepository = new ClientRepository();
    }
    
    private ClientBuilder newClientBuilder() throws Exception, ModelBuilderException{
        Sex s = this.sexes.get(this.form.getjComboSex().getSelectedIndex());
        
        String dateBirth = this.form.getjTextFieldDateBirth().getText();
        
        Date d = new SimpleDateFormat("dd/mm/yyyy").parse(dateBirth);
        
        return (ClientBuilder) 
                    new ClientBuilder()
                        .setCpf(this.form.getjTextFieldCpf().getText())
                        .setRg(this.form.getjTextFieldRg().getText())
                        .setSexo(s.getInitials())
                        .setDataNascimento(d)
                        .setEmail(this.form.getjTextFieldEmail().getText())
                        .setNome(this.form.getjTextFieldName().getText())
                        .setStatus('A')
                        .setTelefones(this.form.getjTextFieldPhone1().getText(), this.form.getjTextFieldPhone2().getText())
                        .setComplementoEndereco(this.form.getjTextFieldStreet().getText())
                        .setObservacao(this.form.getjTextAreaObs().getText())
                        .setEndereco(this.addressLoaded);
    }

    @Override
    protected void resetStates() {
        this.form.activateButtons(false);
        this.form.activateFieldsPerson(false);
        
        ArrayList<javax.swing.JComponent> fields = new ArrayList();
        ArrayList<javax.swing.text.JTextComponent> textFields = new ArrayList();
        
        fields.add(this.form.getjTextFieldCpf());
        fields.add(this.form.getjTextFieldRg());
        fields.add(this.form.getjTextFieldDateBirth());
        fields.add(this.form.getjComboSex());
        
        textFields.add(this.form.getjTextFieldCpf());
        textFields.add(this.form.getjTextFieldRg());
        textFields.add(this.form.getjTextFieldDateBirth());
        
        
        UtilsComponents.disabledComponents(fields, false);
        UtilsComponents.clearFields(textFields);
    }
    
    @Override
    protected void initStates() {
       this.sexes = new ArrayList();
        
       this.sexes.add(new Sex("Masculino", 'M'));
       this.sexes.add(new Sex("Feminino", 'F'));
       
       for(Sex s: this.sexes)
          this.form.getjComboSex().addItem(s.getDescription());
       
       this.form.getjLabelStatus().setText(" ");
    }

    @Override
    protected void onClickButtonNew() {
        this.form.activateButtons(true);
        this.form.activateFieldsPerson(true);
        
        ArrayList<javax.swing.JComponent> fields = new ArrayList();
        ArrayList<javax.swing.text.JTextComponent> textFields = new ArrayList();
        
        fields.add(this.form.getjTextFieldCpf());
        fields.add(this.form.getjTextFieldRg());
        fields.add(this.form.getjTextFieldDateBirth());
        fields.add(this.form.getjComboSex());
        
        textFields.add(this.form.getjTextFieldCpf());
        textFields.add(this.form.getjTextFieldRg());
        textFields.add(this.form.getjTextFieldDateBirth());
        
        
        UtilsComponents.disabledComponents(fields, true);
        UtilsComponents.clearFields(textFields);
        
        this.form.getjLabelStatus().setText("ATIVO");
    }

    @Override
    protected void onClickButtonCreate() {
        try{
            int id = this.clientRepository.nextID();
            
            Client client = this.newClientBuilder().build(id);
            
            this.clientRepository.create(client);
            
            System.out.println("Cliente cadastrado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar o cliente!\nErro: " + error.getMessage());
        }
    }

    @Override
    protected void onClickButtonUpdate() {
        try{
            int id = this.registerLoaded.getId();
            
            Client client = this.newClientBuilder().build(id);
            
            this.clientRepository.update(id, client);
            
            System.out.println("Cliente alterado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao alterado o cliente!\nErro: " + error.getMessage());
        }
    }
    
}
