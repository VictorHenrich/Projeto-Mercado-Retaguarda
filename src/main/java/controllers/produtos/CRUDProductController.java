
package controllers.produtos;
import controllers.builders.produtos.ProductBuilder;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.produtos.Product;
import repositories.produtos.ProductRepository;



public class CRUDProductController implements InterfaceCrudController<ProductBuilder, Product>{
    
    private final ProductRepository repository;
    
    public CRUDProductController() {
        
        ArrayList<Product> products = new ArrayList();
        
        this.repository = new ProductRepository(products);
    }

    @Override
    public ProductBuilder newModelBuilder() {
        return new ProductBuilder();
    }

    @Override
    public void create(ProductBuilder register) {
        Product product = register.build(this.repository.nextID());
        
        this.repository.create(product);
    }

    @Override
    public void update(int id, ProductBuilder register) {
        Product product = register.build(id);
        
        this.repository.update(id, product);
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
    }

    @Override
    public AbstractList<Product> fetch() {
        return this.repository.fetch();
    }

    @Override
    public Product load(int id) {
        return this.repository.load(id);
    }
}
