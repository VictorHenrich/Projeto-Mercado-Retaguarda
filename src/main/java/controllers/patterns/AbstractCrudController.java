
package controllers.patterns;

import java.util.AbstractList;
import models.patterns.BaseModel;
import repositories.patterns.BaseRepository;


public class AbstractCrudController<T extends BaseModel, R extends BaseRepository> implements InterfaceCrudController<T> {
    
    private final BaseRepository<T> repository;

    public AbstractCrudController(BaseRepository<T> repository) {
        this.repository = repository;
    }


    @Override
    public void create(T register) {
        this.repository.create(register);
        
        System.out.println("CADASTRADO COM SUCESSO!");
    }

    @Override
    public void update(int id, T register) {
        this.repository.update(id, register);
        
        System.out.println("ALTERADO COM SUCESSO!");
    }

    @Override
    public void delete(int id) {
        this.repository.delete(id);
        
        System.out.println("EXCLUIDO COM SUCESSO!");
    }

    @Override
    public AbstractList<T> fetch() {
        return this.repository.fetch();
    }

    @Override
    public T load(int id) {
        return this.repository.load(id);
    }

    @Override
    public int nextID() {
        return this.repository.nextID();
    }

   
    
    
    
}
