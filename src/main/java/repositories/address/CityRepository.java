
package repositories.address;
import java.util.ArrayList;
import java.util.List;

import models.address.City;
import repositories.SessionProjectFactory;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;
import repositories.patterns.AbstractCrudRepository;

import javax.persistence.EntityManager;


public class CityRepository extends AbstractCrudRepository<City> {

    @Override
    public City load(int id) throws RepositoryError {
        EntityManager session = SessionProjectFactory.createSession();

        try{
            City city = session.find(City.class, id);

            return city;
            
        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);
        }finally{
            session.close();
        }
    }

    @Override
    public Iterable<City> fetch() throws RepositoryError{
        EntityManager session = SessionProjectFactory.createSession();

        List<City> cities = new ArrayList<City>();

        try{
            cities = session.createQuery(
                    "SELECT c from cidades c",
                    City.class
            ).getResultList();

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.FETCH, error);
        }finally {
            session.close();
        }

        return cities;
    }


}
