
package models.address;

import models.patterns.BaseModel;

import javax.persistence.*;
import java.io.Serializable;


@Entity(name = "enderecos")
public class Address extends BaseModel implements Serializable {

    @JoinColumn(name = "cidade_id")
    @ManyToOne
    private City cidade;

    @JoinColumn(name = "bairro_id")
    @ManyToOne
    private District bairro;

    @Column
    private String logradouro;

    @Column
    private String cep;

    public Address(String logradouro, String cep, City cidade, District bairro, int id) {
        super(id);
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    protected Address(){
        super(0);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public City getCidade() {
        return cidade;
    }

    public void setCidade(City cidade) {
        this.cidade = cidade;
    }

    public District getBairro() {
        return bairro;
    }

    public void setBairro(District bairro) {
        this.bairro = bairro;
    }
    
    
   
}
