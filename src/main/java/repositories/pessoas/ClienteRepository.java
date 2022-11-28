
package repositories.pessoas;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.pessoas.Cliente;


public class ClienteRepository extends BaseRepository<Cliente>{
    
    public ClienteRepository(ArrayList<Cliente> data) {
        super(data);
    }
    
}
