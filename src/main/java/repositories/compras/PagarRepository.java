
package repositories.compras;

import java.util.ArrayList;
import models.compras.Pagar;
import repositories.patterns.BaseRepository;


public class PagarRepository extends BaseRepository<Pagar>{
    
    public PagarRepository(ArrayList<Pagar> data) {
        super(data);
    }
    
}
