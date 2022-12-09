
package models.enderecos;

import java.util.ArrayList;
import models.patterns.BaseModel;


public class City extends BaseModel{
    private String descricao;
    private final ArrayList<Address> enderecos = new ArrayList();

    public City(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }

    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Address> getEnderecos() {
        return enderecos;
    }
    
    
}
