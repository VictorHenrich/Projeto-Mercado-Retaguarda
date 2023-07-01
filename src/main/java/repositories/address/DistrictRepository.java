
package repositories.address;

import models.address.District;
import repositories.patterns.AbstractCrudRepository;



public class DistrictRepository extends AbstractCrudRepository<District> {
    public DistrictRepository() {
        super(District.class, "SELECT b from bairros AS b");
    }

}
