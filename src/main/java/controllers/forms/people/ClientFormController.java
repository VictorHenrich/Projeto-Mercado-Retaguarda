
package controllers.forms.people;

import controllers.builders.pessoa.ClientBuilder;
import controllers.patterns.AbstractFormPersonController;
import controllers.patterns.ModelBuilderException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import models.address.City;
import models.people.Client;
import models.people.Sex;
import repositories.people.ClientRepository;
import view.forms.ClientFormComponent;

import javax.swing.*;


public class ClientFormController extends AbstractFormPersonController<ClientFormComponent, Client> {

    private final ClientRepository clientRepository;
    private ArrayList<Sex> sexes;

    public ClientFormController() {
        super(new ClientFormComponent());

        this.clientRepository = new ClientRepository();
    }

    private ClientBuilder newClientBuilder() {
        ClientBuilder builder = new ClientBuilder();

        int indexSexSelected = this.form.getjComboSex().getSelectedIndex();

        if (!this.sexes.isEmpty() && indexSexSelected >= 0) {
            Sex s = this.sexes.get(indexSexSelected);

            builder.setSexo(s.getInitials());
        }

        if (!this.form.getjTextFieldDateBirth().getText().equals("") && this.form.getjTextFieldDateBirth().getText() != null) {
            try {
                String dateBirth = this.form.getjTextFieldDateBirth().getText();

                Date d = new SimpleDateFormat("dd/MM/yyyy").parse(dateBirth);

                builder.setDataNascimento(d);

            } catch (ParseException error) {
                String messageError = "Falha ao converter a data!\nERRO: " + error.getMessage();

                JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

        try {
            return (ClientBuilder)
                    builder
                            .setCpf(this.form.getjTextFieldCpf().getText())
                            .setRg(this.form.getjTextFieldRg().getText())
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

    private void createClient() {
        ClientBuilder clientBuilder = this.newClientBuilder();

        if (clientBuilder == null) return;

        Client client = clientBuilder.build();

        try {
            this.clientRepository.create(client);

            JOptionPane.showMessageDialog(this.form, "Cliente cadastrado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String errorMessage = "Falha ao cadastrar o cliente!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, errorMessage, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateClient() {

        ClientBuilder clientBuilder = this.newClientBuilder();

        if (clientBuilder == null) return;

        try {
            int id = this.registerLoaded.getId();

            Client client = (Client) clientBuilder.setId(id).build();

            this.clientRepository.update(id, client);

            JOptionPane.showMessageDialog(this.form, "Cliente alterado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String errorMessage = "Falha ao alterar o cliente!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, errorMessage, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void enabledFieldsClient(boolean status) {

        this.enabledFields(status);

        this.form.getjTextFieldCpf().setEnabled(status);
        this.form.getjTextFieldRg().setEnabled(status);
        this.form.getjComboSex().setEnabled(status);
        this.form.getjTextFieldDateBirth().setEnabled(status);
    }

    private void clearFieldsClient() {
        this.clearFields();

        this.form.getjTextFieldCpf().setText("");
        this.form.getjTextFieldRg().setText("");
        this.form.getjTextFieldDateBirth().setText("");
        this.form.getjComboSex().setSelectedIndex(-1);
    }

    private void loadFieldsClient() {
        if (this.registerLoaded == null) return;

        this.loadFields();

        if (!this.sexes.isEmpty()) {
            for(int indexSex=0; indexSex < this.sexes.size(); indexSex++){
                Sex sex = this.sexes.get(indexSex);

                if(sex.getInitials() == this.registerLoaded.getSexo())
                    this.form.getjComboSex().setSelectedIndex(indexSex);
            }
        }

        String dateFormated = new SimpleDateFormat("MM/dd/yyyy").format(this.registerLoaded.getDataCadastro());

        this.form.getjTextFieldCpf().setText(this.registerLoaded.getCpf());
        this.form.getjTextFieldDateBirth().setText(dateFormated);
        this.form.getjTextFieldRg().setText(this.registerLoaded.getRg());
    }

    @Override
    protected void resetStates() {
        this.clearFieldsClient();
        this.enabledFieldsClient(false);

    }

    @Override
    protected void onShowComponent() {
        this.sexes = new ArrayList<Sex>();

        this.sexes.add(new Sex("Masculino", 'M'));
        this.sexes.add(new Sex("Feminino", 'F'));

        if (this.form.getjComboSex().getItemCount() > 0)
            this.form.getjComboSex().removeAllItems();

        for (Sex s : this.sexes)
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
        if (this.registerLoaded == null)
            this.createClient();

        else
            this.updateClient();
    }

    @Override
    protected void onClickButtonChange() {
        this.enabledFieldsClient(true);
    }



}
