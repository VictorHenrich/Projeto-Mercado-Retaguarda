
package repositories.vendas;

import java.util.ArrayList;
import repositories.patterns.CrudRepository;


public class ItemCupomFiscal implements CrudRepository<models.vendas.ItemCupomFiscal>{

    @Override
    public void create(models.vendas.ItemCupomFiscal register) {

    }

    @Override
    public void update(int id, models.vendas.ItemCupomFiscal register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public models.vendas.ItemCupomFiscal load(int id) {
        return null;
    }

    @Override
    public Iterable<models.vendas.ItemCupomFiscal> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
