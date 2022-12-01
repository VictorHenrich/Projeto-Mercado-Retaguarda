
package controllers.enderecos;

import controllers.patterns.AbstractCrudController;
import java.util.ArrayList;
import models.enderecos.District;
import repositories.enderecos.DistrictRepository;
import repositories.patterns.BaseRepository;


public class CRUDDistrictController extends AbstractCrudController<District, DistrictRepository>{
    
    public CRUDDistrictController(BaseRepository<District> repository) {
        super(repository);
    }
}
