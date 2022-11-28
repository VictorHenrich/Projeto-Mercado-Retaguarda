
package repositories.produtos;

import java.util.ArrayList;
import models.produtos.Marca;
import repositories.patterns.BaseRepository;


public class MarcaRepository extends BaseRepository<Marca>{
    
    public MarcaRepository(ArrayList<Marca> data) {
        super(data);
    }
    
}
