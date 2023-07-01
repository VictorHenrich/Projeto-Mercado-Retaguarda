
package repositories.address;

import models.address.Address;
import repositories.SessionProjectFactory;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;
import repositories.patterns.AbstractCrudRepository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;


public class AddressRepository extends AbstractCrudRepository<Address> {

    @Override
    public Address load(int id) throws RepositoryError {
        EntityManager session = SessionProjectFactory.createSession();

        try{
            Address address = session.find(Address.class, id);

            return address;

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);
        }finally{
            session.close();
        }
    }

    @Override
    public Iterable<Address> fetch() throws RepositoryError{
        EntityManager session = SessionProjectFactory.createSession();

        List<Address> addresses = new ArrayList<Address>();

        try{
            addresses = session.createQuery(
                    "SELECT e FROM enderecos e",
                    Address.class
            ).getResultList();

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.FETCH, error);
        }finally {
            session.close();
        }

        return addresses;
    }
}
