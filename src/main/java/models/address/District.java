
package models.address;

import javax.persistence.*;
import models.patterns.BaseModel;


@Entity(name = "bairros")
public class District extends BaseModel{

    @Column
    private String descricao;

    public District(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }

    protected District(){
        super(0);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
