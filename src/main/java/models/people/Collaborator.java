
package models.people;

import models.address.Address;
import javax.persistence.Column;
import javax.persistence.Entity;


@Entity(name = "colaboradores")
public class Collaborator extends Person{

    @Column
    private String login;

    @Column
    private String senha;

    public Collaborator(String login, String senha, String nome, String fone1, String fone2, String complementoEndereco, Address endereco, String email, String observacao, char status, int id) {
        super(nome, fone1, fone2, complementoEndereco, endereco, email, observacao, status, id);
        this.login = login;
        this.senha = senha;
    }

    protected Collaborator(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
       
}
