
package controllers.enderecos;

import controllers.interfaces.InterfaceCrudController;
import java.util.AbstractList;
import java.util.ArrayList;
import models.enderecos.Bairro;
import models.enderecos.Cidade;


public class BairroCrudController implements InterfaceCrudController<Bairro>{
    
    private ArrayList<Bairro> bairrosCadastrados = new ArrayList();

    @Override
    public void cadastrar(Bairro registro) {
        this.bairrosCadastrados.add(registro);
    }

    @Override
    public void alterar(Bairro registroAntigo, Bairro novoRegistro) {
        int posicao = 0;
        
        for(Bairro bairro: this.bairrosCadastrados){
            if(bairro.getId() == registroAntigo.getId()){
                this.bairrosCadastrados.remove(posicao);
                this.bairrosCadastrados.add(posicao, novoRegistro);
            }
            
            posicao++;
        }
    }

    @Override
    public void excluir(Bairro registro) {
        this.bairrosCadastrados.remove(registro);
    }

    @Override
    public AbstractList<Bairro> listar() {
        return this.bairrosCadastrados;
    }

    @Override
    public Bairro carregar(int id) {
        return this.bairrosCadastrados.get(id);
    }

    @Override
    public int proximoId() {
        return this.bairrosCadastrados.size() + 1;
    }
    
}
