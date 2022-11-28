
package models.produtos;

import java.util.ArrayList;
import models.patterns.BaseModel;


public class Marca extends BaseModel{
    private String descricao;
    private final ArrayList<Produto> produtos = new ArrayList();

    public Marca(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }

    
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
