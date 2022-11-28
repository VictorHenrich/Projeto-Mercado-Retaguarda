
package controllers.compras;
import models.compras.Pagar;
import controllers.patterns.AbstractCrudController;
import repositories.compras.PagarRepository;
import repositories.patterns.BaseRepository;

public class PagarCrudController extends AbstractCrudController<Pagar, PagarRepository>{

    public PagarCrudController(BaseRepository<Pagar> repository) {
        super(repository);
    }
    
    
}
