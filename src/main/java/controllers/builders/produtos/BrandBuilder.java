
package controllers.builders.produtos;

import controllers.patterns.ModelBuilder;
import models.produtos.Brand;


public class BrandBuilder implements ModelBuilder<Brand>{
    private String descricao;

    public BrandBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        
        return this;
    }
    
    
    @Override
    public Brand build(int id) {
        return new Brand(
           this.descricao,
           id
        );
    }
    
}
