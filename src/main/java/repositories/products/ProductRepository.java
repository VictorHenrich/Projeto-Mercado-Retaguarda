
package repositories.products;
import models.products.Product;
import repositories.patterns.AbstractCrudRepository;


public class ProductRepository extends AbstractCrudRepository<Product> {

    public ProductRepository() {
        super(Product.class, "SELECT p FROM produtos AS p");
    }
}
