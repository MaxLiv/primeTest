package beans;


import dao.PatientDAO;
import dao.TreatmentDAO;
import entities.Analyzes;
import entities.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class PatientBean implements Serializable {

    @EJB
    PatientDAO patientDAO;

    @EJB
    TreatmentDAO treatmentDAO;

    @ManagedProperty(value = "#{departmentBean}")
    private DepartmentBean departmentBean;

    private List<Analyzes> analyzes;
    private List<Analyzes> selectedAnalyzes;

    private List<Patient> patients;

    private Patient patient = new Patient();

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }

    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public List<Analyzes> getAnalyzes() {
        return treatmentDAO.analyzes();
    }

    public void setAnalyzes(List<Analyzes> analyzes) {
        this.analyzes = analyzes;
    }

    public List<Patient> getPatients() {
        return patientDAO.patients();
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String addPatient(){
        patient.setDoctor(departmentBean.getDoctor());
        patientDAO.addPatient(patient);
        return "patients";
    }
}
