
package repositories.patterns;


public interface CrudRepository<T> {
    
    public void create(T register) throws Exception;
    
    public void update(T register) throws Exception;
    
    public void delete(T register) throws Exception;
    
    public T load(int id) throws Exception;
    
    public Iterable<T> fetch() throws Exception;
    
    public int nextID();
}
