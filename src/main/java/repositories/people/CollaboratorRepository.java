
package repositories.people;
import repositories.patterns.AbstractCrudRepository;
import models.people.Collaborator;

public class CollaboratorRepository extends AbstractCrudRepository<Collaborator> {


    public CollaboratorRepository() {
        super(Collaborator.class, "SELECT c FROM colaboradores AS c");
    }
}
