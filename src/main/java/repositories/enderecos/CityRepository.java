
package repositories.enderecos;

import data.DatabaseData;
import models.enderecos.City;
import repositories.patterns.BaseRepository;


public class CityRepository extends BaseRepository<City>{
    
    public CityRepository() {
        super(DatabaseData.cities);
    }
    
}
