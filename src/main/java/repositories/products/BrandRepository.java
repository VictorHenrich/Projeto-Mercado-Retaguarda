
package repositories.products;

import models.products.Brand;
import repositories.patterns.AbstractCrudRepository;


public class BrandRepository extends AbstractCrudRepository<Brand> {
    public BrandRepository(){
        super(Brand.class, "SELECT m FROM marcas AS m");
    }
}
