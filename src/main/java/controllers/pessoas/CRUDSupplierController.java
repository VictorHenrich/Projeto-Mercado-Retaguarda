
package controllers.pessoas;
import controllers.patterns.AbstractCrudController;
import models.pessoas.Supplier;
import repositories.patterns.BaseRepository;
import repositories.pessoas.SupplierRepository;


public class CRUDSupplierController extends AbstractCrudController<Supplier, SupplierRepository>{

    public CRUDSupplierController(BaseRepository<Supplier> repository) {
        super(repository);
    }
    
    
}
