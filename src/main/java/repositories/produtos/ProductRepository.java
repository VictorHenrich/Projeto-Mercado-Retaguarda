
package repositories.produtos;

import models.produtos.Product;
import repositories.patterns.CrudRepository;


public class ProductRepository implements CrudRepository<Product>{


    @Override
    public void create(Product register) {

    }

    @Override
    public void update(int id, Product register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product load(int id) {
        return null;
    }

    @Override
    public Iterable<Product> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
