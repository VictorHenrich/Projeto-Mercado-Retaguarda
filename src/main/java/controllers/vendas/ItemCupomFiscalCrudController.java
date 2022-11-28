
package controllers.vendas;
import models.vendas.ItemCupomFiscal;
import controllers.patterns.AbstractCrudController;
import repositories.compras.ItemCompraRepository;
import repositories.patterns.BaseRepository;


public class ItemCupomFiscalCrudController extends AbstractCrudController<ItemCupomFiscal, ItemCompraRepository>{
    
    public ItemCupomFiscalCrudController(BaseRepository<ItemCupomFiscal> repository) {
        super(repository);
    }
    
}
