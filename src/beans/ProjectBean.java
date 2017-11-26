package beans;

import entities.Project;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class ProjectBean implements Serializable {

    private Project selectedProject;
    private List<Project> projects;

    @PostConstruct
    public void init() {
        projects = new ArrayList<>();
        projects.add(new Project("Прибавка","Повысить зарплату"));
        projects.add(new Project("Ремонт","Ремонт палат"));
        projects.add(new Project("Оборудывание","Купить новое оборудывание"));
    }


    public Project getSelectedProject() {
        return selectedProject;
    }

    public String setSelectedProject(Project project) {
        this.selectedProject = project;
        return null;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
