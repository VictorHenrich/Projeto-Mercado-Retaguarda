
package controllers.enderecos;

import controllers.interfaces.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.enderecos.Cidade;


public class CidadeCrudController implements InterfaceCrudController<Cidade>{
    
    private ArrayList<Cidade> cidadesCadastradas = new ArrayList();

    @Override
    public void cadastrar(Cidade registro) {
        this.cidadesCadastradas.add(registro);
    }

    @Override
    public void alterar(Cidade registroAntigo, Cidade novoRegistro) {
        int posicao = 0;
        
        for(Cidade cidade: this.cidadesCadastradas){
            if(cidade.getId() == registroAntigo.getId()){
                this.cidadesCadastradas.remove(posicao);
                this.cidadesCadastradas.add(posicao, novoRegistro);
            }
            
            posicao++;
        }
    }

    @Override
    public void excluir(Cidade registro) {
        this.cidadesCadastradas.remove(registro);
    }

    @Override
    public AbstractList<Cidade> listar() {
        return this.cidadesCadastradas;
    }

    @Override
    public Cidade carregar(int id) {
        return this.cidadesCadastradas.get(id);
    }

    @Override
    public int proximoId() {
        return this.cidadesCadastradas.size() + 1;
    }
    
}
