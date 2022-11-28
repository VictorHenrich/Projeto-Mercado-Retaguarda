
package controllers.pessoas;
import controllers.patterns.AbstractCrudController;
import models.pessoas.Fornecedor;
import repositories.patterns.BaseRepository;
import repositories.pessoas.FornecedorRepository;


public class FornecedorCrudController extends AbstractCrudController<Fornecedor, FornecedorRepository>{

    public FornecedorCrudController(BaseRepository<Fornecedor> repository) {
        super(repository);
    }
    
    
}
