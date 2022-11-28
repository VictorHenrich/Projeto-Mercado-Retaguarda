
package controllers.compras;
import models.compras.Compra;
import controllers.patterns.AbstractCrudController;
import repositories.compras.CompraRepository;
import repositories.patterns.BaseRepository;


public class CompraCrudController extends AbstractCrudController<Compra, CompraRepository>{

    public CompraCrudController(BaseRepository<Compra> repository) {
        super(repository);
    }
    
}
