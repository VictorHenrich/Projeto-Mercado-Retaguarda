
package repositories.compras;

import models.compras.ItemCompra;
import repositories.patterns.CrudRepository;


public class ItemCompraRepository implements CrudRepository<ItemCompra>{

    @Override
    public void create(ItemCompra register) {

    }

    @Override
    public void update(int id, ItemCompra register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public ItemCompra load(int id) {
        return null;
    }

    @Override
    public Iterable<ItemCompra> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
