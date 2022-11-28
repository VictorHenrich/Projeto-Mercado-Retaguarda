package models.patterns;

import java.util.ArrayList;


public interface DAOCrudRepository<T> {
    
    public void create(T modelo);
    
    public void update(T modeloAntigo, T modeloNovo);
    
    public void delete(T modeloExclusao);
    
    public T get(int id);
    
    public ArrayList<T> fetch();
}
