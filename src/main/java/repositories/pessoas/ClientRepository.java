
package repositories.pessoas;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.pessoas.Client;


public class ClientRepository extends BaseRepository<Client>{
    
    public ClientRepository(ArrayList<Client> data) {
        super(data);
    }
    
}
