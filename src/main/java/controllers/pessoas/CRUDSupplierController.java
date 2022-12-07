
package controllers.pessoas;
import controllers.builders.pessoa.SupplierBuilder;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.pessoas.Supplier;
import repositories.pessoas.SupplierRepository;



public class CRUDSupplierController implements InterfaceCrudController<SupplierBuilder, Supplier>{
    
    private final SupplierRepository repository;

    public CRUDSupplierController() {
        ArrayList<Supplier> suppliers = new ArrayList();
        
        this.repository = new SupplierRepository(suppliers);
    }
    

    @Override
    public SupplierBuilder newModelBuilder() {
       return this.newModelBuilder();
    }

    @Override
    public void create(SupplierBuilder register) {
        int id = this.repository.nextID();
        
        Supplier supplier = register.build(id);
        
        this.repository.create(supplier);
    }

    @Override
    public void update(int id, SupplierBuilder register) {
        Supplier supplier = register.build(id);
        
        this.repository.update(id, supplier);
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
    }

    @Override
    public AbstractList<Supplier> fetch() {
        return this.repository.fetch();
    }

    @Override
    public Supplier load(int id) {
        return this.repository.load(id);
    }

    
    
}
