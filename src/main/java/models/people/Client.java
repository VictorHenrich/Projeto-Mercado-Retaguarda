
package models.people;

import java.util.ArrayList;
import java.util.Date;
import models.address.Address;
import models.vendas.CupomFiscal;


public class Client extends Person{
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private char sexo;
    private final ArrayList<CupomFiscal> comprasRealizadas = new ArrayList();

    public Client(String cpf, String rg, Date dataNascimento, char sexo, String nome, String fone1, String fone2, String complementoEndereco, Address endereco, String email, String observacao, char status, int id) {
        super(nome, fone1, fone2, complementoEndereco, endereco, email, observacao, status, id);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    protected Client(){

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
