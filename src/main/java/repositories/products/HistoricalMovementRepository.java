
package repositories.products;
import repositories.patterns.AbstractCrudRepository;
import models.products.HistoricalMovement;


public class HistoricalMovementRepository extends AbstractCrudRepository<HistoricalMovement> {

    @Override
    public HistoricalMovement load(int id) {
        return null;
    }

    @Override
    public Iterable<HistoricalMovement> fetch() {
        return null;
    }
}
