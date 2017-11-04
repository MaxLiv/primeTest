package PageTest;

import entities.Doctor;
import entities.Project;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "themeService", eager = true)
@ApplicationScoped
public class ThemeService {

    private String[] selectedDepartments;
    private List<Doctor> selectedDoctors;
    private Doctor doctor;


    private List<Theme> themes;
    private List<Doctor> doctors;
    private List<String> departments;
    private List<Project> projects;
    private String department;




    @PostConstruct
    public void init() {
        themes = new ArrayList<>();
        themes.add(new Theme(0, "На холестерин", "cholesterol"));
        themes.add(new Theme(1, "На гемоглобин", "hemoglobin"));
        themes.add(new Theme(2, "Давление", "pressure"));
        themes.add(new Theme(3, "Анализы", "analis"));

        doctors = new ArrayList<>();
        doctors.add(new Doctor(0, "Иван", "Хирургия"));
        doctors.add(new Doctor(1, "Виктор", "Хирургия"));
        doctors.add(new Doctor(2, "Константин", "Детское отделение"));
        doctors.add(new Doctor(3, "Николай", "Терапевт"));
        doctors.add(new Doctor(4, "Олексей", "Окулист"));

        departments = new ArrayList<>();
        departments.add("Хирургия");
        departments.add("Детское отделение");
        departments.add("Терапевт");
        departments.add("Окулист");

        projects = new ArrayList<>();
        projects.add(new Project("Прибавка","Повысить зарплату"));
        projects.add(new Project("Ремонт","Ремонт палат"));
        projects.add(new Project("Оборудывание","Купить новое оборудывание"));
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setDoctors(List<Doctor> doctors) {
        //List<Doctor> temp = new ArrayList<>();
        //if (department != null) {
        //    for (Doctor doctor : doctors) {
        //        if (doctor.getDepartment().equals(department))
        //            temp.add(doctor);
        //    }
        //    this.doctors = temp;
        //}else
            this.doctors = doctors;
    }

    public void filterDoctors(){
        List<Doctor> temp = new ArrayList<>();
        if (department != null) {
            for (Doctor doctor : doctors) {
                if (doctor.getDepartment().equals(department))
                    temp.add(doctor);
            }
            doctors = temp;

        }
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
            return doctors;
    }

    public void change(){

    }

    public List<String> getDepartments() {
        return departments;
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
