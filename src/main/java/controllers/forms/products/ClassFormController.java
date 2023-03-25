
package controllers.forms.products;

import controllers.builders.produtos.ClassBuilder;
import controllers.patterns.AbstractFormController;
import models.products.Class;
import repositories.products.ClassRepository;
import view.forms.ClassFormComponent;


public class ClassFormController extends AbstractFormController<ClassFormComponent, Class>{
    
    private final ClassRepository classRepository = new ClassRepository();
    
    public ClassFormController() {
        super(new ClassFormComponent());
    }
    
    private ClassBuilder newClassBuilder(){
        return new ClassBuilder()
                    .setDescricao(this.form.getjTextFieldDescription().getText());
    }
    
    private void createClass(){
        try{
            
            int id = this.classRepository.nextID();
            
            Class class_ = this.newClassBuilder().build(id);
            
            this.classRepository.create(class_);
            
            System.out.println("Classe cadastrada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar classe!\nErro: " + error.getMessage());
        }
    }
    
    private void updateClass(){
        try{
            
            int id = this.registerLoaded.getId();
            
            Class class_ = this.newClassBuilder().build(id);
            
            this.classRepository.update(id, class_);
            
            System.out.println("Classe alterada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao alterar classe!\nErro: " + error.getMessage());
        }
    }

    @Override
    protected void onShowComponent() {
        if(this.registerLoaded == null) return;
        
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
        if(this.registerLoaded == null)
            this.createClass();
        else
            this.updateClass();
    }

    @Override
    protected void onClickButtonChange() {
        this.form.getjTextFieldDescription().setEnabled(true);
    }
    
}
