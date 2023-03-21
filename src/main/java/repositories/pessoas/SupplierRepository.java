
package repositories.pessoas;
import repositories.patterns.CrudRepository;
import models.pessoas.Supplier;


public class SupplierRepository implements CrudRepository<Supplier>{


    @Override
    public void create(Supplier register) {

    }

    @Override
    public void update(int id, Supplier register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Supplier load(int id) {
        return null;
    }

    @Override
    public Iterable<Supplier> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
