
package models.address;

import models.patterns.BaseModel;


public class Address extends BaseModel{
    private String logradouro;
    private String cep;
    private City cidade;
    private District bairro;

    public Address(String logradouro, String cep, City cidade, District bairro, int id) {
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
