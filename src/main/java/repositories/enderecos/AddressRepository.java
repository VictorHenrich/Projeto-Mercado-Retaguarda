
package repositories.enderecos;

import java.util.ArrayList;
import models.enderecos.Address;
import repositories.patterns.BaseRepository;


public class AddressRepository extends BaseRepository<Address>{
    
    public AddressRepository(ArrayList<Address> data) {
        super(data);
    }
    
}
