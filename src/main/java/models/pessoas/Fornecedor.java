/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.pessoas;

import java.util.Date;

/**
 *
 * @author Victor Henrich
 */
public class Fornecedor extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;
    private String contato;
    private String razaoSocial;
    private String cpf;
    private String rg;

    public Fornecedor(String cnpj, String inscricaoEstadual, String contato, String razaoSocial, String cpf, String rg, int id, String nome, String fone1, String fone2, String complementoEndereco, String email, Date dataCadastro, String observacao, char status) {
        super(id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status);
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
