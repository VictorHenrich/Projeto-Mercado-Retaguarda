
package repositories.produtos;

import java.util.ArrayList;
import models.produtos.Brand;
import repositories.patterns.BaseRepository;


public class BrandRepository extends BaseRepository<Brand>{
    
    public BrandRepository(ArrayList<Brand> data) {
        super(data);
    }
    
}
