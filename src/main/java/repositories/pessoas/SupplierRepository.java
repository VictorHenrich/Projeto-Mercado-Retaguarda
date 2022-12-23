
package repositories.pessoas;
import data.DatabaseData;
import repositories.patterns.BaseRepository;
import models.pessoas.Supplier;


public class SupplierRepository extends BaseRepository<Supplier>{
    
    public SupplierRepository() {
        super(DatabaseData.suppliers);
    }
    
}
