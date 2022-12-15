
package controllers.forms.people;

import controllers.builders.pessoa.ClientBuilder;
import controllers.patterns.AbstractFormPersonController;
import controllers.patterns.ModelBuilderException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import models.pessoas.Client;
import models.pessoas.Sex;
import repositories.pessoas.ClientRepository;
import view.forms.ClientFormComponent;


public class ClientFormController extends AbstractFormPersonController<ClientFormComponent, Client>{
    
    private final ClientRepository clientRepository;
    private ArrayList<Sex> sexes;
    
    public ClientFormController() {
        super(new ClientFormComponent());
        
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
    
    private void createClient(){
        try{
            int id = this.clientRepository.nextID();
            
            Client client = this.newClientBuilder().build(id);
            
            this.clientRepository.create(client);
            
            System.out.println("Cliente cadastrado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar o cliente!\nErro: " + error.getMessage());
        }
    }
    
    private void updateClient(){
        try{
            int id = this.registerLoaded.getId();
            
            Client client = this.newClientBuilder().build(id);
            
            this.clientRepository.update(id, client);
            
            System.out.println("Cliente alterado com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao alterado o cliente!\nErro: " + error.getMessage());
        }
    }
    
    private void enabledFieldsClient(boolean status){
        
        this.enabledFields(status);
        
        this.form.getjTextFieldCpf().setEnabled(status);
        this.form.getjTextFieldRg().setEnabled(status);
        this.form.getjComboSex().setEnabled(status);
        this.form.getjTextFieldDateBirth().setEnabled(status);
    }
    
    private void clearFieldsClient(){
        this.clearFields();
        
        this.form.getjTextFieldCpf().setText("");
        this.form.getjTextFieldRg().setText("");
        this.form.getjTextFieldDateBirth().setText("");
    }
    
    private void loadFieldsClient(){
        if(this.registerLoaded == null) return;
        
        this.loadFields();
        
        this.form.getjTextFieldCpf().setText(this.registerLoaded.getCpf());
        this.form.getjTextFieldDateBirth().setText(this.registerLoaded.getDataCadastro().toString());
        this.form.getjTextFieldRg().setText(this.registerLoaded.getRg());
    }
    
    @Override
    protected void resetStates() {
        this.clearFields();
        this.enabledFieldsClient(false);
    }
    
    @Override
    protected void onShowComponent() {
       this.sexes = new ArrayList();
        
       this.sexes.add(new Sex("Masculino", 'M'));
       this.sexes.add(new Sex("Feminino", 'F'));
       
       for(Sex s: this.sexes)
          this.form.getjComboSex().addItem(s.getDescription());
       
       
       this.form.getjLabelStatus().setText(" ");
       
       loadFieldsClient();
    }

    @Override
    protected void onClickButtonNew() {
        this.enabledFieldsClient(true);
        this.clearFieldsClient();
        
        this.form.getjLabelStatus().setText("ATIVO");
    }

    @Override
    protected void onClickButtonWrite() {
        if(this.registerLoaded == null)
            this.createClient();
        
        else
            this.updateClient();
    }

    @Override
    protected void onClickButtonChange() {
        this.enabledFieldsClient(true);
    }
    
}
