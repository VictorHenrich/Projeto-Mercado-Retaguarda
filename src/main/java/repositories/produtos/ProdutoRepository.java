
package repositories.produtos;

import java.util.ArrayList;
import models.produtos.Produto;
import repositories.patterns.BaseRepository;


public class ProdutoRepository extends BaseRepository<Produto>{
    
    public ProdutoRepository(ArrayList<Produto> data) {
        super(data);
    }
    
}
