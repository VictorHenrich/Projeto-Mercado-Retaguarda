
package controllers.enderecos;

import controllers.patterns.AbstractCrudController;
import java.util.ArrayList;
import models.enderecos.City;
import repositories.enderecos.CityRepository;
import repositories.patterns.BaseRepository;


public class CRUDCityController extends  AbstractCrudController<City, CityRepository>{
    
    public CRUDCityController(BaseRepository<City> repository) {
        super(repository);
    }
    
    
}
