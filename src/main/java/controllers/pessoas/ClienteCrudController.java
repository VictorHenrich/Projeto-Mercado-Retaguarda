
package controllers.pessoas;

import controllers.interfaces.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.pessoas.Cliente;


public class ClienteCrudController implements InterfaceCrudController<Cliente>{
    
    private ArrayList<Cliente> clientesCadastrados = new ArrayList();

    @Override
    public void cadastrar(Cliente registro) {
        this.clientesCadastrados.add(registro);
    }

    @Override
    public void alterar(Cliente registroAntigo, Cliente novoRegistro) {
        int posicao = 0;
        
        for(Cliente cliente: this.clientesCadastrados){
            if(cliente.getId() == registroAntigo.getId()){
                this.clientesCadastrados.remove(posicao);
                this.clientesCadastrados.add(posicao, novoRegistro);
            }
            
            posicao++;
        }
    }

    @Override
    public void excluir(Cliente registro) {
        this.clientesCadastrados.remove(registro);
    }

    @Override
    public AbstractList<Cliente> listar() {
        return this.clientesCadastrados;
    }

    @Override
    public Cliente carregar(int id) {
        return this.clientesCadastrados.get(id);
    }

    @Override
    public int proximoId() {
        return this.clientesCadastrados.size() + 1;
    }
    
}
