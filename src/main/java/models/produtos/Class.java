
package models.produtos;

import java.util.ArrayList;
import models.patterns.BaseModel;


public class Class extends BaseModel{
    private String descricao;
    private final ArrayList<Product> produtos = new ArrayList();

    public Class(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Product> getProdutos() {
        return produtos;
    }
    
    
}
