
package repositories.produtos;

import data.DatabaseData;
import models.produtos.Brand;
import repositories.patterns.BaseRepository;


public class BrandRepository extends BaseRepository<Brand>{
    
    public BrandRepository() {
        super(DatabaseData.brands);
    }
    
}
