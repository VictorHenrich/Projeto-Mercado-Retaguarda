
package repositories.pessoas;
import models.pessoas.Client;
import repositories.patterns.CrudRepository;


public class ClientRepository implements CrudRepository<Client>{


    @Override
    public void create(Client register) {

    }

    @Override
    public void update(int id, Client register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Client load(int id) {
        return null;
    }

    @Override
    public Iterable<Client> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
