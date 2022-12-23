
package repositories.produtos;

import data.DatabaseData;
import java.util.ArrayList;
import models.produtos.Product;
import repositories.patterns.BaseRepository;


public class ProductRepository extends BaseRepository<Product>{
    
    public ProductRepository() {
        super(DatabaseData.products);
    }
    
}
