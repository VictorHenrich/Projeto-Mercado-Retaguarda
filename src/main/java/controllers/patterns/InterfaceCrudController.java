
package controllers.patterns;

import java.util.AbstractList;
import models.patterns.BaseModel;


public interface InterfaceCrudController<T extends ModelBuilder, M extends BaseModel> {
    
    public T newModelBuilder();
    
    public void create(T register);
    
    public void update(int id, T register);
    
    public void delete(int id);
    
    public AbstractList<M> fetch();
    
    public M load(int id);
}
