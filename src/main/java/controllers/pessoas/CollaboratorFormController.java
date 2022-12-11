
package controllers.pessoas;

import controllers.patterns.AbstractFormPersonController;
import java.util.ArrayList;
import models.enderecos.Address;
import models.pessoas.Collaborator;
import view.CollaboratorFormComponent;


public class CollaboratorFormController extends AbstractFormPersonController<CollaboratorFormComponent, Collaborator>{

    public CollaboratorFormController(CollaboratorFormComponent form, ArrayList<Address> addresses) {
        super(form, addresses);
    }

    
    @Override
    protected void resetStates() {
        this.form.activateFieldsPerson(false);
        
        this.form.getjTextFieldPassword().setEnabled(false);
        this.form.getjTextFieldUser().setEnabled(false);
    }

    @Override
    protected void initStates() {
        this.form.activateFieldsPerson(true);
        
        this.form.getjTextFieldPassword().setEnabled(true);
        this.form.getjTextFieldUser().setEnabled(true);
    }

    @Override
    protected void create() {
       
    }

    @Override
    protected void update() {
        
    }
    
}
