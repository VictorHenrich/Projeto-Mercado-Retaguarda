
package controllers.patterns;

import java.util.AbstractList;


public interface InterfaceCrudController<T> {
    
    public void create(T register);
    
    public void update(int id, T register);
    
    public void delete(int id);
    
    public AbstractList<T> fetch();
    
    public T load(int id);
    
    public int nextID();
}
