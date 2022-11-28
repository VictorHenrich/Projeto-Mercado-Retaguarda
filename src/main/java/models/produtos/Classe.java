
package models.produtos;

import java.util.ArrayList;
import models.patterns.BaseModel;


public class Classe extends BaseModel{
    private String descricao;
    private final ArrayList<Produto> produtos = new ArrayList();

    public Classe(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
    
}
