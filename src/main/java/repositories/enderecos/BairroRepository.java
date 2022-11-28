
package repositories.enderecos;

import java.util.ArrayList;
import models.enderecos.Bairro;
import repositories.patterns.BaseRepository;


public class BairroRepository extends BaseRepository<Bairro>{
    
    public BairroRepository(ArrayList<Bairro> data) {
        super(data);
    }
    
}
