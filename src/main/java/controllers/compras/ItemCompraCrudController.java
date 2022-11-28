
package controllers.compras;
import models.compras.ItemCompra;
import controllers.patterns.AbstractCrudController;
import repositories.compras.ItemCompraRepository;
import repositories.patterns.BaseRepository;


public class ItemCompraCrudController extends AbstractCrudController<ItemCompra, ItemCompraRepository>{

    public ItemCompraCrudController(BaseRepository<ItemCompra> repository) {
        super(repository);
    }
    
    
    
}
