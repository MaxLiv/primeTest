package beans;


import entities.Patient;

import javax.faces.application.FacesMessage;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
@Named("bean")
public class PatientBean implements Serializable {

    private List<Patient> patients;

    private Patient patient = new Patient();

    public List<Patient> getPatients() {
        List<Patient> list = new ArrayList<>();
        list.add(new Patient(1, "Ivan","Ivanov",20));
        list.add(new Patient(2, "Semen","Semenov",25));
        list.add(new Patient(3, "Ivan","Ivanov",20));
        list.add(new Patient(4, "Ivan","Ivanov",20));
        patients = list;
        return patients;
    }

//    @PostConstruct
//    public void init() {
//        List<Patient> list = new ArrayList<>();
//        list.add(new Patient(1, "Ivan","Ivanov",20));
//        list.add(new Patient(2, "Semen","Semenov",25));
//        list.add(new Patient(3, "Ivan","Ivanov",20));
//        list.add(new Patient(4, "Ivan","Ivanov",20));
//        patients = list;
//    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
