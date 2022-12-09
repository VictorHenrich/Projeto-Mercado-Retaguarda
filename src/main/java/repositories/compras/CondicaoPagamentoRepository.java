
package repositories.compras;

import java.util.ArrayList;
import models.compras.CondicaoPagamento;
import repositories.patterns.BaseRepository;


public class CondicaoPagamentoRepository extends BaseRepository<CondicaoPagamento>{
    
    public CondicaoPagamentoRepository(ArrayList<CondicaoPagamento> data) {
        super(data);
    }
    
}
