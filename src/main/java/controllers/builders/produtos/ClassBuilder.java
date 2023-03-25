
package controllers.builders.produtos;
import controllers.patterns.ModelBuilder;
import models.products.Class;


public class ClassBuilder implements ModelBuilder<models.products.Class>{
    private String descricao;

    public ClassBuilder setDescricao(String descricao) {
        this.descricao = descricao;
        
        return this;
    }
    
    @Override
    public Class build(int id) {
        return new Class(
           this.descricao,
           id
        );
    }
    
}
