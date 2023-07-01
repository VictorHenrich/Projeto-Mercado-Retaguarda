
package models.products;

import java.util.ArrayList;
import models.patterns.BaseModel;


public class Class extends BaseModel{
    private String descricao;
    private final ArrayList<Product> produtos = new ArrayList();

    public Class(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }


    protected Class() {
        super(0);
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
