
package models.pessoas;

import java.util.ArrayList;
import models.address.Address;
import models.vendas.CupomFiscal;


public class Collaborator extends Person{
    private String login;
    private String senha;
    private final ArrayList<CupomFiscal> vendasRealizadas = new ArrayList();

    public Collaborator(String login, String senha, String nome, String fone1, String fone2, String complementoEndereco, Address endereco, String email, String observacao, char status, int id) {
        super(nome, fone1, fone2, complementoEndereco, endereco, email, observacao, status, id);
        this.login = login;
        this.senha = senha;
    }


    public ArrayList<CupomFiscal> getVendasRealizadas() {
        return vendasRealizadas;
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
