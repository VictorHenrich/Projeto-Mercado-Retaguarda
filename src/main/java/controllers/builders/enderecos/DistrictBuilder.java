
package controllers.builders.enderecos;

import controllers.patterns.ModelBuilder;
import controllers.patterns.ModelBuilderException;
import models.address.District;


public class DistrictBuilder implements ModelBuilder<District>{
    private String descricao;

    public DistrictBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        
        return this;
    }
    
    
    @Override
    public District build(int id) throws ModelBuilderException{
        if(this.descricao == null || this.descricao.equals(""))
            throw new ModelBuilderException("Campo de texto não preenchido!");
            
        return new District(
          this.descricao,
          id
        );
    }
    
}
