
package models.products;

import models.patterns.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity(name = "marcas")
public class Brand extends BaseModel{
    @Column()
    private String descricao;


    public Brand(String descricao, int id) {
        super(id);
        this.descricao = descricao;
    }

    protected Brand() {
        super(0);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
