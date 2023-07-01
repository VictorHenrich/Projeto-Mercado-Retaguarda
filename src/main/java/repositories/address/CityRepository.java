
package repositories.address;

import models.address.City;
import repositories.patterns.AbstractCrudRepository;



public class CityRepository extends AbstractCrudRepository<City> {

    public CityRepository() {
        super(City.class, "SELECT c from cidades AS c");
    }

}
