
package controllers.produtos;
import models.produtos.Produto;
import controllers.patterns.AbstractCrudController;
import repositories.patterns.BaseRepository;
import repositories.produtos.ProdutoRepository;

public class ProdutoCrudController extends AbstractCrudController<Produto, ProdutoRepository>{

    public ProdutoCrudController(BaseRepository<Produto> repository) {
        super(repository);
    }
    
    
}
