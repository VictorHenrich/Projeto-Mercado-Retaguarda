
package repositories.vendas;

import java.util.ArrayList;
import models.vendas.CupomFiscal;
import repositories.patterns.CrudRepository;


public class CupomFiscalRepository implements CrudRepository<CupomFiscal>{

    @Override
    public void create(CupomFiscal register) {

    }

    @Override
    public void update(int id, CupomFiscal register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public CupomFiscal load(int id) {
        return null;
    }

    @Override
    public Iterable<CupomFiscal> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
