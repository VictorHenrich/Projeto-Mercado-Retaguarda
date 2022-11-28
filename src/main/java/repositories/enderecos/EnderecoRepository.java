
package repositories.enderecos;

import java.util.ArrayList;
import models.enderecos.Endereco;
import repositories.patterns.BaseRepository;


public class EnderecoRepository extends BaseRepository<Endereco>{
    
    public EnderecoRepository(ArrayList<Endereco> data) {
        super(data);
    }
    
}
