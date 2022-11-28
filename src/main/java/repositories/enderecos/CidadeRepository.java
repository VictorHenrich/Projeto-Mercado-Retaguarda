
package repositories.enderecos;

import java.util.ArrayList;
import models.enderecos.Cidade;
import repositories.patterns.BaseRepository;


public class CidadeRepository extends BaseRepository<Cidade>{
    
    public CidadeRepository(ArrayList<Cidade> data) {
        super(data);
    }
    
}
