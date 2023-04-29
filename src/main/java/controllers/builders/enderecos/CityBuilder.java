
package controllers.builders.enderecos;

import controllers.patterns.ModelBuilder;
import controllers.patterns.ModelBuilderException;
import models.address.City;


public class CityBuilder extends ModelBuilder<City>{
    private String descricao;

    public CityBuilder setDescricao(String descricao) throws ModelBuilderException {
        if(descricao == null || descricao.equals(""))
            throw new ModelBuilderException("Campo de texto não preenchido!");

        this.descricao = descricao;
        
        return this;
    }
    
    @Override
    public City build(){
        return new City(
          this.descricao,
          this.id
        );
    }
}
