package beans;

import dao.SuppliesDAO;
import entities.Drug;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean
@SessionScoped
public class SuppliesBean implements Serializable {

    private boolean getAll = true;

    @EJB
    private SuppliesDAO suppliesDAO;

    private List<Drug> drugs;

    private Drug drug = new Drug();
    private String name;
    private String description;
    private int count;
    private Date date;

    public List<Drug> getDrugs() {
        if (getAll) return suppliesDAO.drugs();
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addDrug() {
        suppliesDAO.addDrug(new Drug(name,count,description));
    }

    public boolean isGetAll() {
        return getAll;
    }

    public void setGetAll(boolean getAll) {
        this.getAll = getAll;
    }

    public SuppliesDAO getSuppliesDAO() {
        return suppliesDAO;
    }

    public void setSuppliesDAO(SuppliesDAO suppliesDAO) {
        this.suppliesDAO = suppliesDAO;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
