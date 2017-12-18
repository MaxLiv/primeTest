package entities;

import javax.persistence.*;

@Entity
public class Project {

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Project() {

    }

    private String name;

    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String description;

    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    private double value;

    @Basic
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
