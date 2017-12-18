package dao;

import entities.Department;
import entities.Doctor;

import javax.ejb.Stateless;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class DepartmentDAO extends AbstractDAO {

    public List<Department> departments(){
        Query query = manager.createQuery("SELECT d FROM Department d");
        return query.getResultList();
    }

    public List<Doctor> doctors(){
        Query query = manager.createQuery("SELECT d FROM Doctor d");
        return query.getResultList();
    }
}
