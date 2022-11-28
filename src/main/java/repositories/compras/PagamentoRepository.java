
package repositories.compras;

import java.util.ArrayList;
import models.compras.Pagamento;
import repositories.patterns.BaseRepository;


public class PagamentoRepository extends BaseRepository<Pagamento>{
    
    public PagamentoRepository(ArrayList<Pagamento> data) {
        super(data);
    }
    
}
