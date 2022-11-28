
package controllers.enderecos;

import java.util.ArrayList;
import models.enderecos.Endereco;
import controllers.interfaces.InterfaceCrudController;
import java.util.AbstractList;


public class EnderecosCrudController implements InterfaceCrudController<Endereco>{
    
    private ArrayList<Endereco> enderecosCadastrados = new ArrayList();

    @Override
    public void cadastrar(Endereco registro) {
        this.enderecosCadastrados.add(registro);
    }

    @Override
    public void alterar(Endereco registroAntigo, Endereco novoRegistro) {
        int posicao = 0;
        
        for(Endereco endereco: this.enderecosCadastrados){
            if(endereco.getId() == registroAntigo.getId()){
                this.enderecosCadastrados.remove(posicao);
                this.enderecosCadastrados.add(novoRegistro);
            }
        }
    }

    @Override
    public void excluir(Endereco registro) {
        if(!this.enderecosCadastrados.remove(registro))
           System.out.println("Não foi possível realizar a exclusão deste registro!");
    }

    @Override
    public AbstractList<Endereco> listar() {
        return this.enderecosCadastrados;
    }

    @Override
    public Endereco carregar(int id) {
        return this.enderecosCadastrados.get(id);
    }

    @Override
    public int proximoId() {
       return this.enderecosCadastrados.size() + 1;
    }

}
