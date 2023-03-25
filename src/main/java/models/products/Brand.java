
package models.products;

import java.util.ArrayList;
import models.patterns.BaseModel;


public class Brand extends BaseModel{
    private String descricao;
    private final ArrayList<Product> produtos = new ArrayList();

    public Brand(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }

    
    public ArrayList<Product> getProdutos() {
        return produtos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
