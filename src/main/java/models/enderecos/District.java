
package models.enderecos;

import java.util.ArrayList;
import models.patterns.BaseModel;


public class District extends BaseModel{
    private String descricao;
    private final ArrayList<Address> enderecos = new ArrayList();

    public District(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }

    

    public ArrayList<Address> getEnderecos() {
        return enderecos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
