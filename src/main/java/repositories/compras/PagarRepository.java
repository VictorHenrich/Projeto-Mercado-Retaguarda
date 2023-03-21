
package repositories.compras;

import models.compras.Pagar;
import repositories.patterns.CrudRepository;


public class PagarRepository implements CrudRepository<Pagar>{


    @Override
    public void create(Pagar register) {

    }

    @Override
    public void update(int id, Pagar register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Pagar load(int id) {
        return null;
    }

    @Override
    public Iterable<Pagar> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
