/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.pessoas;

import java.util.ArrayList;
import java.util.Date;
import models.vendas.CupomFiscal;

/**
 *
 * @author Victor Henrich
 */
public class Cliente extends Pessoa{
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private char sexo;
    private ArrayList<CupomFiscal> comprasRealizadas;

    public Cliente(
        String cpf, 
        String rg, 
        Date dataNascimento, 
        char sexo, 
        int id, 
        String nome, 
        String fone1, 
        String fone2, 
        String complementoEndereco, 
        String email, 
        Date dataCadastro, 
        String observacao, 
        char status
    ) {
        super(id, nome, fone1, fone2, complementoEndereco, email, dataCadastro, observacao, status);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.comprasRealizadas = new ArrayList();
    }

    public ArrayList<CupomFiscal> getComprasRealizadas() {
        return comprasRealizadas;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
   
   
}
