
package repositories.address;

import java.util.ArrayList;
import java.util.List;

import models.address.District;
import repositories.SessionProjectFactory;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;
import repositories.patterns.AbstractCrudRepository;

import javax.persistence.EntityManager;


public class DistrictRepository extends AbstractCrudRepository<District> {

    @Override
    public District load(int id) throws RepositoryError {

        EntityManager session = SessionProjectFactory.createSession();

        try{
            District district = session.find(District.class, id);

            return district;

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);
        }finally{
            session.close();
        }
    }

    @Override
    public Iterable<District> fetch() throws RepositoryError{
        EntityManager session = SessionProjectFactory.createSession();

        List<District> districties = new ArrayList<District>();

        try{
            districties = session.createQuery(
                    "SELECT b from bairros b",
                    District.class
            ).getResultList();

        }catch(Exception error){
            throw new RepositoryError(this, ModulesRepositoy.LOAD, error);
        }finally {
            session.close();
        }

        return districties;

    }

}
