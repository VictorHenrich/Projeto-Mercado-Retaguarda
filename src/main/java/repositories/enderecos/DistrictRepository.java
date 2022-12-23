
package repositories.enderecos;

import data.DatabaseData;
import models.enderecos.District;
import repositories.patterns.BaseRepository;


public class DistrictRepository extends BaseRepository<District>{
    
    public DistrictRepository() {
        super(DatabaseData.districts);
    }
    
}
