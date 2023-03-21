
package repositories.compras;

import models.compras.Compra;
import repositories.patterns.CrudRepository;


public class CompraRepository implements CrudRepository<Compra>{

    @Override
    public void create(Compra register) {

    }

    @Override
    public void update(int id, Compra register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Compra load(int id) {
        return null;
    }

    @Override
    public Iterable<Compra> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
