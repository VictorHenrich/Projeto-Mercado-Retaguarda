
package controllers.builders.pessoa;

import models.people.Supplier;


public class SupplierBuilder extends AbstractPersonBuilder<Supplier>{
    private String cnpj;
    private String inscricaoEstadual;
    private String contato;
    private String razaoSocial;
    private String cpf;
    private String rg;

    public SupplierBuilder setCnpj(String cnpj) {
        this.cnpj = cnpj;
        
        return this;
    }

    public SupplierBuilder setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
        
        return this;
    }

    public SupplierBuilder setContato(String contato) {
        this.contato = contato;
        
        return this;
    }

    public SupplierBuilder setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        
        return this;
    }

    public SupplierBuilder setCpf(String cpf) {
        this.cpf = cpf;
        
        return this;
    }

    public SupplierBuilder setRg(String rg) {
        this.rg = rg;
        
        return this;
    }
    
    
    @Override
    public Supplier build(int id) {
        return new Supplier(
            this.cnpj, 
            this.inscricaoEstadual,
            this.contato,
            this.razaoSocial,
            this.cpf,
            this.rg,
            this.nome,
            this.telefone1,
            this.telefone2,
            this.complementoEndereco,
            this.endereco,
            this.email,
            this.observacao,
            this.status,
            id
        );
    }
    
}
