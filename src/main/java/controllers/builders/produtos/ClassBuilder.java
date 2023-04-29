
package controllers.builders.produtos;
import controllers.patterns.ModelBuilder;
import controllers.patterns.ModelBuilderException;
import models.products.Class;


public class ClassBuilder extends ModelBuilder<models.products.Class>{
    private String descricao;

    public ClassBuilder setDescricao(String descricao) throws ModelBuilderException{
        if(descricao == null || descricao.equals(""))
            throw new ModelBuilderException("Campo descrição de classe está vazio!");

        this.descricao = descricao;
        
        return this;
    }
    
    @Override
    public Class build() {
        return new Class(
           this.descricao,
           this.id
        );
    }
    
}
