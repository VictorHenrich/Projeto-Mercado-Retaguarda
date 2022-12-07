
package repositories.produtos;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.produtos.HistoricalMovement;


public class HistoricalMovementRepository extends BaseRepository<HistoricalMovement>{
    
    public HistoricalMovementRepository(ArrayList<HistoricalMovement> data) {
        super(data);
    }
    
}
