

package models.address;

import javax.persistence.*;
import models.patterns.BaseModel;

import java.io.Serializable;

@Entity(name = "cidades")
public class City extends BaseModel implements Serializable {
    @Column
    private String descricao;

    public City(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }

    protected City() {
        super(0);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
