
package controllers.forms.people;

import controllers.builders.pessoa.CollaboratorBuilder;
import controllers.patterns.AbstractFormPersonController;
import controllers.patterns.ModelBuilderException;
import models.people.Collaborator;
import repositories.people.CollaboratorRepository;
import view.forms.CollaboratorFormComponent;

import javax.swing.*;


public class CollaboratorFormController extends AbstractFormPersonController<CollaboratorFormComponent, Collaborator> {

    private final CollaboratorRepository collaboratorRepository;

    public CollaboratorFormController() {
        super(new CollaboratorFormComponent());

        this.collaboratorRepository = new CollaboratorRepository();
    }

    private CollaboratorBuilder newCollaboratorBuilder() {
        try {
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

        } catch (ModelBuilderException error) {
            JOptionPane.showMessageDialog(this.form, error.getMessage(), "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    private void createCollaborator() {
        CollaboratorBuilder collaboratorBuilder = this.newCollaboratorBuilder();

        if (collaboratorBuilder == null) return;

        Collaborator collaborator = collaboratorBuilder.build();

        try {
            this.collaboratorRepository.create(collaborator);

            JOptionPane.showMessageDialog(this.form, "Colaborador cadastrado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao cadastrar colaborador!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateCollaborator() {

        CollaboratorBuilder collaboratorBuilder = this.newCollaboratorBuilder();

        if (collaboratorBuilder == null) return;

        try {
            Collaborator collaborator = (Collaborator) collaboratorBuilder.setId(this.registerLoaded.getId()).build();

            this.collaboratorRepository.update(collaborator);

            JOptionPane.showMessageDialog(this.form, "Colaborador alterado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao alterar colaborador!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFieldsCollaborator() {
        this.clearFields();

        this.form.getjTextFieldPassword().setText("");
        this.form.getjTextFieldUser().setText("");
    }

    private void enabledFieldsCollaborator(boolean status) {
        this.form.getjTextFieldPassword().setEnabled(status);
        this.form.getjTextFieldUser().setEnabled(status);

        this.enabledFields(status);
    }

    @Override
    protected void resetStates() {
        this.clearFieldsCollaborator();
        this.enabledFieldsCollaborator(false);

        this.form.getjLabelStatus().setText(" ");
    }

    @Override
    protected void onClickButtonNew() {
        this.form.activateFieldsPerson(true);

        this.clearFieldsCollaborator();
        this.enabledFieldsCollaborator(true);

        this.form.getjLabelStatus().setText("ATIVO");
    }

    @Override
    protected void onClickButtonWrite() {
        if (this.registerLoaded == null)
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
        if (this.registerLoaded == null) return;

        this.loadFields();

        this.form.getjTextFieldUser().setText(this.registerLoaded.getLogin());
        this.form.getjTextFieldPassword().setText(this.registerLoaded.getSenha());
    }

}
