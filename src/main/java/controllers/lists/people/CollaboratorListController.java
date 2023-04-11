
package controllers.lists.people;

import controllers.forms.people.CollaboratorFormController;
import controllers.patterns.AbstractListController;
import java.util.ArrayList;
import models.people.Collaborator;
import repositories.people.CollaboratorRepository;
import view.lists.CollaboratorListComponent;


public class CollaboratorListController extends AbstractListController<CollaboratorListComponent, Collaborator>{

    public CollaboratorListController() {
        super(
            new CollaboratorListComponent(), 
            new CollaboratorFormController(), 
            new CollaboratorRepository()
        );
    }

    @Override
    protected ArrayList<String[]> getRows() {
        ArrayList<String[]> rows = new ArrayList();
        
        for(Collaborator collaborator: this.getRegisters()){
            String[] row = {
                "" + collaborator.getId(),
                collaborator.getNome(),
            };
            
            rows.add(row);
        }
        
        return rows;
    }
    
}
