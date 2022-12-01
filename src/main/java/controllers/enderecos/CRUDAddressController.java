
package controllers.enderecos;

import models.enderecos.Address;
import controllers.patterns.AbstractCrudController;
import java.util.ArrayList;
import repositories.enderecos.AddressRepository;
import repositories.patterns.BaseRepository;


public class CRUDAddressController extends AbstractCrudController<Address, AddressRepository>{
    
    public CRUDAddressController(BaseRepository<Address> repository) {
        super(repository);
    }
    

}
