
package models.pessoas;

import java.util.ArrayList;
import java.util.Date;
import models.vendas.CupomFiscal;


public class Colaborador extends Pessoa{
    private String login;
    private String senha;
    private ArrayList<CupomFiscal> vendasRealizadas;

    public Colaborador(String login, String senha, int id, String nome, String fone1, String fone2, String complementoEndereco, String email, Date dataCadastro, String observacao, char status) {
        super(id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status);
        this.login = login;
        this.senha = senha;
        this.vendasRealizadas = new ArrayList();
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
