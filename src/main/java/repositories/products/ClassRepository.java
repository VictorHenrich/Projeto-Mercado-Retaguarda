
package repositories.products;
import repositories.patterns.AbstractCrudRepository;
import models.products.Class;

public class ClassRepository extends AbstractCrudRepository<Class> {
    public ClassRepository() {
        super(Class.class, "SELECT c FROM classes AS c");
    }
}
