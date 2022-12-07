
package controllers.produtos;
import controllers.builders.produtos.ClassBuilder;
import controllers.patterns.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.produtos.Class;
import repositories.produtos.ClassRepository;


public class CRUDClassController implements InterfaceCrudController<ClassBuilder, Class>{
    
    private final ClassRepository repository;
    
    public CRUDClassController() {
        
        ArrayList<Class> classes = new ArrayList();
        
        this.repository = new ClassRepository(classes);
    }

    @Override
    public ClassBuilder newModelBuilder() {
        return new ClassBuilder();
    }

    @Override
    public void create(ClassBuilder register) {
        Class class_ = register.build(this.repository.nextID());
        
        this.repository.create(class_);
    }

    @Override
    public void update(int id, ClassBuilder register) {
        Class class_ = register.build(id);
        
        this.repository.update(id, class_);
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
    }

    @Override
    public AbstractList<Class> fetch() {
        return this.repository.fetch();
    }

    @Override
    public Class load(int id) {
        return this.repository.load(id);
    }
    
    
    
    
}
