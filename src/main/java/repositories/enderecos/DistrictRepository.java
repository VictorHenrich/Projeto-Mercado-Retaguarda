
package repositories.enderecos;

import java.util.ArrayList;
import models.enderecos.District;
import repositories.patterns.BaseRepository;


public class DistrictRepository extends BaseRepository<District>{
    
    public DistrictRepository(ArrayList<District> data) {
        super(data);
    }
    
}
