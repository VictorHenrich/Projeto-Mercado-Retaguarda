
package models.patterns;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class BaseModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final int id;

    @Column(name = "data_cadastro")
    @Temporal(TemporalType.TIMESTAMP)
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
