
package repositories.enderecos;

import data.DatabaseData;
import models.enderecos.Address;
import repositories.patterns.BaseRepository;


public class AddressRepository extends BaseRepository<Address>{
    
    public AddressRepository() {
        super(DatabaseData.addresses);
    }
    
}
