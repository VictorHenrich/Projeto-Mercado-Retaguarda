
package controllers.produtos;

import controllers.builders.produtos.ClassBuilder;
import controllers.patterns.AbstractFormController;
import models.produtos.Class;
import repositories.produtos.ClassRepository;
import view.ClassFormComponent;


public class ClassFormController extends AbstractFormController<ClassFormComponent, Class>{
    
    private ClassRepository classRepository = new ClassRepository();
    
    public ClassFormController(ClassFormComponent form) {
        super(form);
    }
    
    private ClassBuilder newClassBuilder(){
        return new ClassBuilder()
                    .setDescricao(this.form.getjTextFieldDescription().getText());
    }

    @Override
    protected void initStates() {
        
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
    protected void onClickButtonCreate() {
        try{
            
            int id = this.classRepository.nextID();
            
            Class class_ = this.newClassBuilder().build(id);
            
            this.classRepository.create(class_);
            
            System.out.println("Classe cadastrada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao cadastrar classe!\nErro: " + error.getMessage());
        }
    }

    @Override
    protected void onClickButtonUpdate() {
        try{
            
            int id = this.registerLoaded.getId();
            
            Class class_ = this.newClassBuilder().build(id);
            
            this.classRepository.update(id, class_);
            
            System.out.println("Classe alterada com sucesso!");
            
        }catch(Exception error){
            System.out.println("Falha ao alterar classe!\nErro: " + error.getMessage());
        }
    }
    
}
