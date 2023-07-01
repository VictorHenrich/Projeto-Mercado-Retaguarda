package repositories.patterns;

import models.patterns.BaseModel;
import repositories.SessionProjectFactory;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

abstract public class AbstractCrudRepository<T extends BaseModel> implements ICrudRepository<T> {

    private final Class<T> cls;
    private final String sqlFetch;

    public AbstractCrudRepository(
            Class<T> cls,
            String sqlFetch
    ){
        this.cls = cls;
        this.sqlFetch = sqlFetch;
    }

    @Override
    public void create(T register) throws Exception {
        EntityManager session = SessionProjectFactory.createSession();

        try{
            session.getTransaction().begin();
            session.persist(register);
            session.getTransaction().commit();

        }catch(Exception error){
            session.getTransaction().rollback();

            throw new RepositoryError(
                    this,
                    ModulesRepositoy.INSERT,
                    error
            );

        }finally{
            session.close();
        }
    }

    @Override
    public void update(T register) throws RepositoryError {
        EntityManager session = SessionProjectFactory.createSession();

        try{
            session.getTransaction().begin();
            session.merge(register);
            session.getTransaction().commit();

        }catch(Exception error){
            session.getTransaction().rollback();

            throw new RepositoryError(
                    this,
                    ModulesRepositoy.UPDATE,
                    error
            );

        }finally{
            session.close();
        }
    }

    @Override
    public void delete(T register) throws RepositoryError {
        EntityManager session = SessionProjectFactory.createSession();

        try{

            T object = session.find(this.cls, register.getId());

            session.getTransaction().begin();

            session.remove(object);

            session.getTransaction().commit();

        }catch(Exception error){
            session.getTransaction().rollback();

            throw new RepositoryError(
                    this,
                    ModulesRepositoy.DELETE,
                    error
            );

        }finally{
            session.close();
        }
    }

    @Override
    public T load(int id) throws RepositoryError{
        EntityManager session = SessionProjectFactory.createSession();

        T object = null;

        try{
            object = session.find(this.cls, id);

        }catch(Exception error){
            throw new RepositoryError(
                    this,
                    ModulesRepositoy.LOAD,
                    error
            );
        }finally {
            session.close();
        }

        return object;
    }

    @Override
    public Iterable<T> fetch() throws RepositoryError{
        EntityManager session = SessionProjectFactory.createSession();

        List<T> objects = new ArrayList<T>();

        try{

            objects = session.createQuery(
                    this.sqlFetch,
                    this.cls
            ).getResultList();

        }catch(Exception error){
            throw new RepositoryError(
                    this,
                    ModulesRepositoy.FETCH,
                    error
            );
        }

        return objects;
    }
}
