
package models.patterns;

import java.util.Date;


public abstract class BaseModel{
    private final int id;
    private final Date dataCadastro = new Date();
    
    public BaseModel(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
    
    
}
