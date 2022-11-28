
package models.enderecos;

import models.patterns.BaseModel;


public class Endereco extends BaseModel{
    private String logradouro;
    private String cep;
    private Cidade cidade;
    private Bairro bairro;

    public Endereco(String logradouro, String cep, Cidade cidade, Bairro bairro, int id) {
        super(id);
        this.logradouro = logradouro;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
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
