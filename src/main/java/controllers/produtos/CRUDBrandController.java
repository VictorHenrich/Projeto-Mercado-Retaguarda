
package controllers.produtos;
import controllers.builders.produtos.BrandBuilder;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.produtos.Brand;
import repositories.produtos.BrandRepository;



public class CRUDBrandController implements InterfaceCrudController<BrandBuilder, Brand>{

    private final BrandRepository repository;
    
    public CRUDBrandController() {
        
        ArrayList<Brand> brands = new ArrayList();
        
        this.repository = new BrandRepository(brands);
    }

    @Override
    public BrandBuilder newModelBuilder() {
        return new BrandBuilder();
    }

    @Override
    public void create(BrandBuilder register) {
        Brand brand = register.build(this.repository.nextID());
        
        this.repository.create(brand);
    }

    @Override
    public void update(int id, BrandBuilder register) {
        Brand brand = register.build(id);
        
        this.repository.update(id, brand);
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
    }

    @Override
    public AbstractList<Brand> fetch() {
        return this.repository.fetch();
    }

    @Override
    public Brand load(int id) {
        return this.repository.load(id);
    }
}
