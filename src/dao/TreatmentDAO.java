package dao;

import entities.Analyzes;

import javax.ejb.Stateless;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class TreatmentDAO extends AbstractDAO{

    public List<Analyzes> analyzes(){
        Query query = manager.createQuery("SELECT a FROM Analyzes a");
        return query.getResultList();
    }
}
