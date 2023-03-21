
package repositories.compras;

import models.compras.Pagamento;
import repositories.patterns.CrudRepository;


public class PagamentoRepository implements CrudRepository<Pagamento>{


    @Override
    public void create(Pagamento register) {

    }

    @Override
    public void update(int id, Pagamento register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Pagamento load(int id) {
        return null;
    }

    @Override
    public Iterable<Pagamento> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
