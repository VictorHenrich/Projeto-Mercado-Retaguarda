
package repositories.produtos;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.produtos.HistoricoMovimentacao;

public class HistoricoMovimentacaoRepository extends BaseRepository<HistoricoMovimentacao>{
    
    public HistoricoMovimentacaoRepository(ArrayList<HistoricoMovimentacao> data) {
        super(data);
    }
    
}
