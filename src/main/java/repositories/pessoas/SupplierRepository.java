
package repositories.pessoas;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.pessoas.Supplier;


public class SupplierRepository extends BaseRepository<Supplier>{
    
    public SupplierRepository(ArrayList<Supplier> data) {
        super(data);
    }
    
}
