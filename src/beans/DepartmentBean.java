package beans;

import dao.DepartmentDAO;
import entities.Department;
import entities.Doctor;
import entities.Project;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ManagedBean
@ApplicationScoped
public class DepartmentBean {

    @EJB
    private DepartmentDAO departmentDAO;

    private String[] selectedDepartments;
    private List<Doctor> selectedDoctors;
    private Doctor doctor;


    private List<Doctor> doctors;
    private List<String> departments;
    private String department;

    @PostConstruct
    public void init() {

        doctors = departmentDAO.doctors();
        departments = departmentDAO.departments().stream().map(Department::getName).collect(Collectors.toList());
    }

    public void setDoctors(List<Doctor> doctors) {
            this.doctors = doctors;
    }

    public List<Doctor> getDoctors() {
        List<Doctor> temp = new ArrayList<>();
        if (department != null) {
            for (Doctor doctor : doctors) {
                if (doctor.getDepartment().equals(department))
                    temp.add(doctor);
            }
            return temp;
        } else
            return departmentDAO.doctors();
    }

    public List<String> getDepartments() {
        return departmentDAO.departments().stream().map(Department::getName).collect(Collectors.toList());
    }

    public String[] getSelectedDepartments() {
        return selectedDepartments;
    }

    public void setSelectedDepartments(String[] selectedDepartments) {
        this.selectedDepartments = selectedDepartments;
    }

    public List<Doctor> getSelectedDoctors() {
        return selectedDoctors;
    }

    public void setSelectedDoctors(List<Doctor> selectedDoctors) {
        this.selectedDoctors = selectedDoctors;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
