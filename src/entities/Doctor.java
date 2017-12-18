package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Doctor {

    public Doctor(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public Doctor() {
    }

    private int id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;

    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String department;

    @Basic
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }

    private Collection<Patient> patients;

    @OneToMany(mappedBy = "doctor")
    public Collection<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Collection<Patient> patients) {
        this.patients = patients;
    }
}
