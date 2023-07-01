
package repositories.products;
import repositories.patterns.AbstractCrudRepository;
import models.products.HistoricalMovement;


public class HistoricalMovementRepository extends AbstractCrudRepository<HistoricalMovement> {
    public HistoricalMovementRepository() {
        super(HistoricalMovement.class, "");
    }
}
