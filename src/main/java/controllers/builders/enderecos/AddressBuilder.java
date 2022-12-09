
package controllers.builders.enderecos;

import controllers.patterns.ModelBuilder;
import controllers.patterns.ModelBuilderException;
import models.enderecos.Address;
import models.enderecos.City;
import models.enderecos.District;


public class AddressBuilder implements ModelBuilder<Address>{
    
    private String logradouro;
    private String cep;
    private City cidade;
    private District bairro;

    public AddressBuilder setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        
        return this;
    }

    public AddressBuilder setCep(String cep) {
        this.cep = cep;
        
        return this;
    }

    public AddressBuilder setCidade(City cidade) {
        this.cidade = cidade;
        
        return this;
    }

    public AddressBuilder setBairro(District bairro) {
        this.bairro = bairro;
        
        return this;
    }

    @Override
    public Address build(int id) throws ModelBuilderException{
        if(this.cep == null)
           throw new ModelBuilderException("Campo de CEP não informado!");
        
        if(this.logradouro == null)
            throw new ModelBuilderException("Campo logradouro não informado!");
        
        if(this.cidade == null)
            throw new ModelBuilderException("Campo cidade não informado!");
        
        if(this.bairro == null)
            throw new ModelBuilderException("Campo bairro não informado!");
        
        return new Address(
            this.logradouro,
            this.cep,
            this.cidade,
            this.bairro,
            id
        );
    }
    
}
