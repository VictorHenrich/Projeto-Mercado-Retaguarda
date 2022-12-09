
package repositories.compras;

import java.util.ArrayList;
import models.compras.Compra;
import repositories.patterns.BaseRepository;


public class CompraRepository extends BaseRepository<Compra>{
    
    public CompraRepository(ArrayList<Compra> data) {
        super(data);
    }
    
}
