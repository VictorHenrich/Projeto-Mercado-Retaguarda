
package repositories.pessoas;
import java.util.ArrayList;
import repositories.patterns.BaseRepository;
import models.pessoas.Fornecedor;


public class FornecedorRepository extends BaseRepository<Fornecedor>{
    
    public FornecedorRepository(ArrayList<Fornecedor> data) {
        super(data);
    }
    
}
