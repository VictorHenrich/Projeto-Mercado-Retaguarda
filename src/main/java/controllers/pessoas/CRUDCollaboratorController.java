
package controllers.pessoas;

import controllers.builders.pessoa.CollaboratorBuilder;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.pessoas.Collaborator;
import repositories.pessoas.CollaboratorRepository;


public class CRUDCollaboratorController implements InterfaceCrudController<CollaboratorBuilder, Collaborator>{
    private final CollaboratorRepository repository;

    public CRUDCollaboratorController() {
        
        ArrayList<Collaborator> collaborators = new ArrayList();
        
        this.repository = new CollaboratorRepository(collaborators);
    }

    @Override
    public CollaboratorBuilder newModelBuilder() {
        return new CollaboratorBuilder();
    }

    @Override
    public void create(CollaboratorBuilder register) {
        Collaborator collaborator = register.build(this.repository.nextID());
        
        this.repository.create(collaborator);
    }

    @Override
    public void update(int id, CollaboratorBuilder register) {
        Collaborator collaborator = register.build(id);
        
        this.repository.update(id, collaborator);
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
    }

    @Override
    public AbstractList<Collaborator> fetch() {
        return this.repository.fetch();
    }

    @Override
    public Collaborator load(int id) {
        return this.repository.load(id);
    }
    
    
    
    
}
