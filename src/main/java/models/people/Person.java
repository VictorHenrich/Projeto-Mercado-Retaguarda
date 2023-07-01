
package models.people;

import models.address.Address;
import models.patterns.BaseModel;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public abstract class Person extends BaseModel implements Serializable {

    @Column
    private String nome;

    @Column
    private String fone1;

    @Column
    private String fone2;

    @Column(name = "endereco_complemento")
    private String complementoEndereco;

    @JoinColumn
    @ManyToOne
    private Address endereco;

    @Column
    private String email;

    @Column
    private String observacao;

    @Column
    private char status;

    public Person(
        String nome, 
        String fone1, 
        String fone2, 
        String complementoEndereco, 
        Address endereco, 
        String email, 
        String observacao, 
        char status, 
        int id
    ) {
        super(id);
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.complementoEndereco = complementoEndereco;
        this.email = email;
        this.observacao = observacao;
        this.status = status;
        this.endereco = endereco;
    }

    protected Person(){
        super(0);
    }

    public Address getEndereco() {
        return endereco;
    }

    public void setEndereco(Address endereco) {
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
    
    
}
