
package repositories.produtos;

import data.DatabaseData;
import models.produtos.Brand;
import repositories.patterns.CrudRepository;


public class BrandRepository implements CrudRepository<Brand>{


    @Override
    public void create(Brand register) {

    }

    @Override
    public void update(int id, Brand register) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Brand load(int id) {
        return null;
    }

    @Override
    public Iterable<Brand> fetch() {
        return null;
    }

    @Override
    public int nextID() {
        return 0;
    }
}
