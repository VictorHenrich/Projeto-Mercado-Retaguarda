
package repositories.produtos;

import java.util.ArrayList;
import models.produtos.Product;
import repositories.patterns.BaseRepository;


public class ProductRepository extends BaseRepository<Product>{
    
    public ProductRepository(ArrayList<Product> data) {
        super(data);
    }
    
}
