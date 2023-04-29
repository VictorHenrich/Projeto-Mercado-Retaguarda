
package controllers.builders.enderecos;

import controllers.patterns.ModelBuilder;
import controllers.patterns.ModelBuilderException;
import models.address.District;


public class DistrictBuilder extends ModelBuilder<District>{
    private String descricao;

    public DistrictBuilder setDescricao(String descricao) throws ModelBuilderException{
        if(descricao == null || descricao.equals(""))
            throw new ModelBuilderException("Campo de texto não preenchido!");

        this.descricao = descricao;
        
        return this;
    }
    
    
    @Override
    public District build(){
            
        return new District(
          this.descricao,
          this.id
        );
    }
    
}
