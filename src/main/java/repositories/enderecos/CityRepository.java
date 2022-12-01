
package repositories.enderecos;

import java.util.ArrayList;
import models.enderecos.City;
import repositories.patterns.BaseRepository;


public class CityRepository extends BaseRepository<City>{
    
    public CityRepository(ArrayList<City> data) {
        super(data);
    }
    
}
