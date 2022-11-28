
package controllers.interfaces;

import java.util.AbstractList;


public interface InterfaceCrudController<T> {
    
    public void cadastrar(T registro);
    
    public void alterar(T registroAntigo, T novoRegistro);
    
    public void excluir(T registro);
    
    public AbstractList<T> listar();
    
    public T carregar(int id);
    
    public int proximoId();
}
