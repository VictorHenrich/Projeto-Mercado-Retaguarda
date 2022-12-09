
package repositories.patterns;


public interface CrudRepository<T> {
    
    public void create(T register);
    
    public void update(int id, T register);
    
    public void delete(int id);
    
    public T load(int id);
    
    public Iterable<T> fetch();
    
    public int nextID();
}
