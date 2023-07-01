package repositories.patterns;

import models.patterns.BaseModel;
import repositories.SessionProjectFactory;
import repositories.exceptions.ModulesRepositoy;
import repositories.exceptions.RepositoryError;

import javax.persistence.EntityManager;

abstract public class AbstractCrudRepository<T extends BaseModel> implements CrudRepository<T>{
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
            session.getTransaction().begin();
            session.remove(register);
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
    abstract public T load(int id) throws RepositoryError;

    @Override
    abstract public Iterable<T> fetch() throws RepositoryError;

    @Override
    public int nextID() {
        return 0;
    }
}
