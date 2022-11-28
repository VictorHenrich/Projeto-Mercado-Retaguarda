
package models.enderecos;

import java.util.ArrayList;
import models.patterns.BaseModel;


public class Bairro extends BaseModel{
    private String descricao;
    private final ArrayList<Endereco> enderecos = new ArrayList();

    public Bairro(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }

    

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
