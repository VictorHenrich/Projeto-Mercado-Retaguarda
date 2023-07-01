package repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SessionProjectFactory {
    static private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("projeto-mercado-jpa");

    static public EntityManager createSession(){
        return entityManagerFactory.createEntityManager();
    }
}
