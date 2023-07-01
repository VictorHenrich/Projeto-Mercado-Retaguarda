
package repositories.address;

import models.address.Address;
import repositories.patterns.AbstractCrudRepository;


public class AddressRepository extends AbstractCrudRepository<Address> {

    public AddressRepository() {
        super(Address.class, "SELECT e FROM enderecos e");
    }
}
