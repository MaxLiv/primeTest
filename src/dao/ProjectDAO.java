package dao;

import entities.Project;

import javax.ejb.Stateless;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class ProjectDAO {

    @PersistenceContext
    private EntityManager manager;

    public List<Project> projects(){
        Query query = manager.createQuery("SELECT p FROM Project p");
        return query.getResultList();
    }
}
