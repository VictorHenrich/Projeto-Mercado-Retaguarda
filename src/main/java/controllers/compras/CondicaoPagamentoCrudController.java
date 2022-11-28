
package controllers.compras;
import models.compras.CondicaoPagamento;
import controllers.patterns.AbstractCrudController;
import repositories.compras.CondicaoPagamentoRepository;
import repositories.patterns.BaseRepository;

public class CondicaoPagamentoCrudController extends AbstractCrudController<CondicaoPagamento, CondicaoPagamentoRepository>{

    public CondicaoPagamentoCrudController(BaseRepository<CondicaoPagamento> repository) {
        super(repository);
    }
    
    
}
