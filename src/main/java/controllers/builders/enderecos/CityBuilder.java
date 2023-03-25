
package controllers.builders.enderecos;

import controllers.patterns.ModelBuilder;
import controllers.patterns.ModelBuilderException;
import models.address.City;


public class CityBuilder implements ModelBuilder<City>{
    private String descricao;

    public CityBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        
        return this;
    }
    
    
    @Override
    public City build(int id) throws ModelBuilderException {
        if(this.descricao == null || this.descricao.equals(""))
            throw new ModelBuilderException("Campo de texto não preenchido!");
       
            
        return new City(
          this.descricao,
          id
        );
    }
}
