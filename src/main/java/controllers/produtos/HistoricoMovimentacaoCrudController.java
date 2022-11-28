
package controllers.produtos;
import models.produtos.HistoricoMovimentacao;
import controllers.patterns.AbstractCrudController;
import repositories.patterns.BaseRepository;
import repositories.produtos.HistoricoMovimentacaoRepository;

public class HistoricoMovimentacaoCrudController extends AbstractCrudController<HistoricoMovimentacao, HistoricoMovimentacaoRepository>{

    public HistoricoMovimentacaoCrudController(BaseRepository<HistoricoMovimentacao> repository) {
        super(repository);
    }
    
    
}
