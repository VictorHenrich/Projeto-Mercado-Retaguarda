
package models.people;

import models.address.Address;


public class Supplier extends Person{
    private String cnpj;
    private String inscricaoEstadual;
    private String contato;
    private String razaoSocial;
    private String cpf;
    private String rg;

    public Supplier(
        String cnpj, 
        String inscricaoEstadual, 
        String contato, 
        String razaoSocial, 
        String cpf, 
        String rg, 
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
        super(nome, fone1, fone2, complementoEndereco, endereco, email, observacao, status, id);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.contato = contato;
        this.razaoSocial = razaoSocial;
        this.cpf = cpf;
        this.rg = rg;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
}
