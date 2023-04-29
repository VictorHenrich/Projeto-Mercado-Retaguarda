
package controllers.builders.enderecos;

import controllers.patterns.ModelBuilder;
import controllers.patterns.ModelBuilderException;
import models.address.Address;
import models.address.City;
import models.address.District;


public class AddressBuilder extends ModelBuilder<Address>{
    
    private String logradouro;
    private String cep;
    private City cidade;
    private District bairro;

    public AddressBuilder setLogradouro(String logradouro) throws ModelBuilderException{
        if(logradouro == null || logradouro.equals(""))
            throw new ModelBuilderException("Campo logradouro não informado!");

        this.logradouro = logradouro;
        
        return this;
    }

    public AddressBuilder setCep(String cep) throws ModelBuilderException {
        if(cep == null || cep.equals(""))
            throw new ModelBuilderException("Campo de CEP não informado!");

        this.cep = cep;
        
        return this;
    }

    public AddressBuilder setCidade(City cidade) throws ModelBuilderException{
        if(cidade == null)
            throw new ModelBuilderException("Campo cidade não informado!");

        this.cidade = cidade;
        
        return this;
    }

    public AddressBuilder setBairro(District bairro) throws ModelBuilderException{
        if(bairro == null)
            throw new ModelBuilderException("Campo bairro não informado!");

        this.bairro = bairro;
        
        return this;
    }

    @Override
    public Address build(){
        return new Address(
            this.logradouro,
            this.cep,
            this.cidade,
            this.bairro,
            this.id
        );
    }
    
}
