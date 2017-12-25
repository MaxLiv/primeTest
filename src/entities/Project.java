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

    private double valueBoss;

    @Basic
    public double getValueBoss() {
        return valueBoss;
    }

    public void setValueBoss(double valueBoss) {
        this.valueBoss = valueBoss;
    }

    private double valueDoctor;

    @Basic
    public double getValueDoctor() {
        return valueDoctor;
    }

    public void setValueDoctor(double valueDoctor) {
        this.valueDoctor = valueDoctor;
    }

    private double valueNurse;

    @Basic
    public double getValueNurse() {
        return valueNurse;
    }

    public void setValueNurse(double valueNurse) {
        this.valueNurse = valueNurse;
    }

    private double valueAdmin;

    @Basic
    public double getValueAdmin() {
        return valueAdmin;
    }

    public void setValueAdmin(double value) {
        this.valueAdmin = value;
    }
}
