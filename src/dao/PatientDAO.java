package dao;

import entities.Patient;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class PatientDAO {

    @PersistenceContext
    private EntityManager manager;

    public List<Patient> patients() {
        Query query = manager.createQuery("SELECT p FROM Patient p");
        return query.getResultList();
    }

    public Patient patient() {
        Query query = manager.createQuery("SELECT p FROM Patient p where p.id = 1");
        return (Patient) query.getSingleResult();
    }

    public void addPatient(Patient patient) {
        manager.persist(patient);
    }
}
