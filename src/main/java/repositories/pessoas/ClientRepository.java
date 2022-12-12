
package repositories.pessoas;
import data.DatabaseData;
import repositories.patterns.BaseRepository;
import models.pessoas.Client;


public class ClientRepository extends BaseRepository<Client>{
    
    public ClientRepository() {
        super(DatabaseData.clients);
    }
    
}
