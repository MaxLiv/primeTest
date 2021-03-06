package beans;

import dao.ProjectDAO;
import entities.Project;
import entities.Vote;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class ProjectBean implements Serializable {

    @EJB
    ProjectDAO projectDAO;

    private List<Project> projects;
    private Project selectedProject;
    private int count;
    private Vote vote;


    @PostConstruct
    public void init() {
        count = 0;
    }

    public List<Project> getProjects() {
        return projectDAO.projects();
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

}
