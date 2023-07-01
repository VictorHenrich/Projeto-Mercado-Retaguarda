
package models.products;
import models.patterns.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;


@Entity(name = "classes")
public class Class extends BaseModel implements Serializable {
    @Column
    private String descricao;

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
}
