
package repositories.vendas;

import java.util.ArrayList;
import models.vendas.CupomFiscal;
import repositories.patterns.BaseRepository;


public class CupomFiscalRepository extends BaseRepository<CupomFiscal>{
    
    public CupomFiscalRepository(ArrayList<CupomFiscal> data) {
        super(data);
    }
    
}
