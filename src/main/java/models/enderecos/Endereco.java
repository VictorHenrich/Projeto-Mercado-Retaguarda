
package models.enderecos;

import models.pessoas.Pessoa;


public class Endereco {
    private int id;
    private String logradouro;
    private String cep;
    private Pessoa pessoa;
    private Cidade cidade;
    private Bairro bairro;

    public Endereco(
        int id, 
        String logradouro, 
        String cep,
        Cidade cidade, 
        Bairro bairro
    ) {
        this.id = id;
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }
    
    
   
}
