package beans;

import entities.Vote;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class ProjectBean implements Serializable {

    private List<Project> projects;
    private Project selectedProject;
    private int count;
    private Vote vote;


    @PostConstruct
    public void init() {
        count = 0;
        vote = new Vote();
        List<Project> root = new ArrayList<>();
        root.add(new Project("Поднять зп", "Увеличить зарплату", 0));
        root.add(new Project("Оборудывание", "Купить новое оборудывание", 1));
        root.add(new Project("Персонал", "Найм дополнительного персонала", 2));
        root.add(new Project("Ремонт", "Ремонт в палатах", 3));
        this.projects = root;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Project getSelectedProject() {
        return selectedProject;
    }

    public void setSelectedProject(Project selectedProject) {
        this.selectedProject = selectedProject;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }

    public void oneVote() {
        count++;
        selectedProject.setPrice(calc());
    }

    private Integer calc() {
        return (selectedProject.getPrice() + vote.getPrice());
    }
}
