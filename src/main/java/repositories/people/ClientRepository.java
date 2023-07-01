
package repositories.people;
import models.people.Client;
import repositories.patterns.AbstractCrudRepository;


public class ClientRepository extends AbstractCrudRepository<Client> {


    public ClientRepository() {
        super(Client.class, "SELECT c FROM clientes AS c");
    }
}
