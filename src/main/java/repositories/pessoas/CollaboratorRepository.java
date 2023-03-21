
package repositories.pessoas;
import repositories.patterns.CrudRepository;
import models.pessoas.Collaborator;

public class CollaboratorRepository implements CrudRepository<Collaborator>{


    @Override
    public void create(Collaborator register) {

    }

    @Override
    public void update(int id, Collaborator register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Collaborator load(int id) {
        return null;
    }

    @Override
    public Iterable<Collaborator> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
