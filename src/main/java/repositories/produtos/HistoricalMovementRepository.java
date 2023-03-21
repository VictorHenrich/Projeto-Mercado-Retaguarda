
package repositories.produtos;
import repositories.patterns.CrudRepository;
import models.produtos.HistoricalMovement;


public class HistoricalMovementRepository implements CrudRepository<HistoricalMovement>{


    @Override
    public void create(HistoricalMovement register) {

    }

    @Override
    public void update(int id, HistoricalMovement register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public HistoricalMovement load(int id) {
        return null;
    }

    @Override
    public Iterable<HistoricalMovement> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
