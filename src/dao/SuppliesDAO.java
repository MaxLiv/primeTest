package dao;

import entities.Drug;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class SuppliesDAO {

    @PersistenceContext
    private EntityManager manager;

    public List<Drug> drugs(){
        Query query = manager.createQuery("SELECT d FROM Drug d");
        return query.getResultList();
    }
}
