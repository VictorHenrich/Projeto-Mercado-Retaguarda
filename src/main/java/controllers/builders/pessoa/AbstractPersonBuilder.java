
package controllers.builders.pessoa;

import controllers.patterns.ModelBuilder;
import models.address.Address;
import models.people.Person;


public abstract class AbstractPersonBuilder<T extends Person> implements ModelBuilder<T>{
    
    protected String nome;
    protected String telefone1;
    protected String telefone2;
    protected String email;
    protected String observacao;
    protected String complementoEndereco;
    protected Address endereco;
    protected char status;
    
    public AbstractPersonBuilder setComplementoEndereco(String complemento){
        this.complementoEndereco = complemento;
        
        return this;
    }
    
    public AbstractPersonBuilder setNome(String nome){
        this.nome = nome;
        
        return this;
    }
    
    public AbstractPersonBuilder setTelefones(String telefone1, String telefone2){
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        
        return this;
    }
    
    public AbstractPersonBuilder setEmail(String email){
        this.email = email;
        
        return this;
    }
    
    public AbstractPersonBuilder setObservacao(String obs){
        this.observacao = obs;
        
        return this;
    }
    
    public AbstractPersonBuilder setStatus(char status){
        this.status = status;
        
        return this;
    }
    
    public AbstractPersonBuilder setEndereco(Address endereco){
        this.endereco = endereco;
        
        return this;
    }
    
    
    @Override
    abstract public T build(int id);
    
}
