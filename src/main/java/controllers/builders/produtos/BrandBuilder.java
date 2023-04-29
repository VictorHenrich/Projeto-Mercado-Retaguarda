
package controllers.builders.produtos;

import controllers.patterns.ModelBuilder;
import controllers.patterns.ModelBuilderException;
import models.products.Brand;


public class BrandBuilder extends ModelBuilder<Brand>{
    private String descricao;

    public BrandBuilder setDescricao(String descricao) throws ModelBuilderException{
        if(descricao == null || descricao.equals(""))
            throw new ModelBuilderException("Campo descrição de marca está vazio!");

        this.descricao = descricao;
        
        return this;
    }
    
    
    @Override
    public Brand build() {
        return new Brand(
           this.descricao,
           this.id
        );
    }
    
}
