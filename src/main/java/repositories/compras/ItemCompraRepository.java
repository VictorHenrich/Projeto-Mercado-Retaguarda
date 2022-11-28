
package repositories.compras;

import java.util.ArrayList;
import models.compras.ItemCompra;
import repositories.patterns.BaseRepository;


public class ItemCompraRepository extends BaseRepository<ItemCompra>{
    
    public ItemCompraRepository(ArrayList<ItemCompra> data) {
        super(data);
    }
    
}
