
package controllers.forms.products;

import controllers.builders.produtos.ClassBuilder;
import controllers.patterns.AbstractFormController;
import models.products.Class;
import repositories.products.ClassRepository;
import view.forms.ClassFormComponent;

import javax.swing.*;


public class ClassFormController extends AbstractFormController<ClassFormComponent, Class> {

    private final ClassRepository classRepository = new ClassRepository();

    public ClassFormController() {
        super(new ClassFormComponent());
    }

    private ClassBuilder newClassBuilder() {
        try {
            return new ClassBuilder()
                    .setDescricao(this.form.getjTextFieldDescription().getText());

        } catch (Exception error) {
            JOptionPane.showMessageDialog(this.form, error.getMessage(), "AVISO ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return null;
    }

    private void createClass() {
        ClassBuilder classBuilder = this.newClassBuilder();

        if (classBuilder == null) return;

        Class class_ = classBuilder.build();

        try {
            this.classRepository.create(class_);

            JOptionPane.showMessageDialog(this.form, "Classe cadastrada com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao cadastrar classe!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateClass() {

        ClassBuilder classBuilder = this.newClassBuilder();

        if (classBuilder == null) return;

        try {

            int id = this.registerLoaded.getId();

            Class class_ = (Class) classBuilder.setId(id).build();

            this.classRepository.update(class_);

            JOptionPane.showMessageDialog(this.form, "Classe alterado com sucesso!", "AVISO", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception error) {
            String messageError = "Falha ao alterar classe!\nERRO: " + error.getMessage();

            JOptionPane.showMessageDialog(this.form, messageError, "AVISO ERRO", JOptionPane.ERROR_MESSAGE);
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
            this.createClass();
        else
            this.updateClass();
    }

    @Override
    protected void onClickButtonChange() {
        this.form.getjTextFieldDescription().setEnabled(true);
    }

}
