
package repositories.compras;

import models.compras.CondicaoPagamento;
import repositories.patterns.CrudRepository;


public class CondicaoPagamentoRepository implements CrudRepository<CondicaoPagamento>{

    @Override
    public void create(CondicaoPagamento register) {

    }

    @Override
    public void update(int id, CondicaoPagamento register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public CondicaoPagamento load(int id) {
        return null;
    }

    @Override
    public Iterable<CondicaoPagamento> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
