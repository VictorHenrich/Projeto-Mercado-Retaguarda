
package controllers.compras;
import models.compras.Pagamento;
import controllers.patterns.AbstractCrudController;
import repositories.compras.PagamentoRepository;
import repositories.patterns.BaseRepository;


public class PagamentoCrudController extends AbstractCrudController<Pagamento, PagamentoRepository>{

    public PagamentoCrudController(BaseRepository<Pagamento> repository) {
        super(repository);
    }
    
    
    
}
