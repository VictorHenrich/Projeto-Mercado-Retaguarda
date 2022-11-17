package patterns;

import java.util.ArrayList;


public interface DAORepository<T> {
    
    public void create(T modelo);
    
    public void update(T modeloAntigo, T modeloNovo);
    
    public void delete(T modeloExclusao);
    
    public T get(T modeloBusca);
    
    public ArrayList<T> fetch();
}
