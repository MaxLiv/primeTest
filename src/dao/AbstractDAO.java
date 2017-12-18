package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractDAO {

    @PersistenceContext
    protected EntityManager manager;

    public void add(Object o) {
        manager.persist(o);
    }
}
