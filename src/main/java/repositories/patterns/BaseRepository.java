
package repositories.patterns;

import java.util.AbstractList;
import java.util.ArrayList;
import models.exceptions.ModelNotFoundException;
import models.patterns.BaseModel;


public abstract class BaseRepository<T extends BaseModel> implements CrudRepository<T> {
    private final ArrayList<T> data;

    public BaseRepository(ArrayList<T> data) {
        this.data = data;
    }

    @Override
    public void create(T register) {
        this.data.add(register);
    }

    @Override
    public void update(int id, T register) {
        int index = 0;
        
        for(BaseModel r: this.data){
            if(r.getId() == id){
                this.data.remove(index);
                this.data.add(index, r);
            }
            
            index++;
        }
    }

    @Override
    public void delete(int id) {
        int index = 0;
        
        for(T r: this.data){
            if(r.getId() == id){
                this.data.remove(index);
                this.data.add(index, r);
            }
            
            index++;
        }
    }

    @Override
    public AbstractList<T> fetch() {
        return this.data;
    }

    @Override
    public T load(int id) {
        try{
            int index = 0;
        
        for(T r: this.data){
            if(r.getId() == id)
                return this.data.get(index);
            
            index++;
        }
        
        throw new ModelNotFoundException();
        
        }catch(ModelNotFoundException error){
            System.out.println(error.getMessage());
        }
        
        return null;
    }

    @Override
    public int nextID() {
        return this.data.size() + 1;
    }
    
    
}
