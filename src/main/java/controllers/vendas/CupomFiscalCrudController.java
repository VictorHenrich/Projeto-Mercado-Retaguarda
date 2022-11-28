
package controllers.vendas;
import models.vendas.CupomFiscal;
import controllers.patterns.AbstractCrudController;
import repositories.patterns.BaseRepository;
import repositories.vendas.CupomFiscalRepository;

public class CupomFiscalCrudController extends AbstractCrudController<CupomFiscal, CupomFiscalRepository>{
    
    public CupomFiscalCrudController(BaseRepository<CupomFiscal> repository) {
        super(repository);
    }
    
}
