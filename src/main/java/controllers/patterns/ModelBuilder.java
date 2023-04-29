
package controllers.patterns;

import controllers.builders.enderecos.AddressBuilder;
import models.address.District;
import models.patterns.BaseModel;


public abstract class ModelBuilder<T extends BaseModel>{
    protected int id = 0;

    public ModelBuilder setId(int id) throws ModelBuilderException{
        if(id < 0)
            throw new ModelBuilderException("Campo ID passado é inválido!");

        this.id = id;

        return this;
    }
    public abstract T build() throws ModelBuilderException;
}
