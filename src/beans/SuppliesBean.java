package beans;

import dao.SuppliesDAO;
import entities.Drug;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
@Named
public class SuppliesBean implements Serializable {

    private boolean getAll = true;

    @EJB
    private SuppliesDAO suppliesDAO;

    private List<Drug> drugs;

    private Drug drug;


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

    public void addDrug() {
        suppliesDAO.addDrug(drug);
    }


}
