
package repositories.patterns;


public interface CrudRepository<T> {
    
    public void create(T register) throws Exception;
    
    public void update(int id, T register) throws Exception;
    
    public void delete(int id) throws Exception;
    
    public T load(int id) throws Exception;
    
    public Iterable<T> fetch() throws Exception;
    
    public int nextID();
}
