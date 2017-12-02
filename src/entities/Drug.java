package entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Drug {

    public Drug(String name, int count, String description) {
        this.name = name;
        this.count = count;
        this.description = description;
    }

    private int id;

    public Drug() {
    }


    @GeneratedValue
    @Id
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

    private int count;

    @Basic
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private String description;

    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
