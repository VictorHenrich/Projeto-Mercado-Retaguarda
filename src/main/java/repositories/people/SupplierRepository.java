
package repositories.people;
import repositories.patterns.AbstractCrudRepository;
import models.people.Supplier;


public class SupplierRepository extends AbstractCrudRepository<Supplier> {

    public SupplierRepository() {
        super(Supplier.class, "SELECT f FROM fornecedores AS f");
    }
}
