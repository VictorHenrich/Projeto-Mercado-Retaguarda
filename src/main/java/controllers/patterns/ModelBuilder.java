
package controllers.patterns;

import models.patterns.BaseModel;


public interface ModelBuilder<T extends BaseModel>{    
    public T build(int id) throws ModelBuilderException, Exception;
}
