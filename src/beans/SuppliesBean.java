package beans;

import dao.SuppliesDAO;
import entities.Drug;

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

    @EJB
    private SuppliesDAO suppliesDAO;

    private List<Drug> drugs;

    private Drug drug;

    public List<Drug> getDrugs() {
//        List<Drug> drugs = new ArrayList<>();
//        drugs.add(new Drug(1, "Фармадол", 10, "От головы"));
//        drugs.add(new Drug(2, "Активированный уголь", 8, "От отравления"));
//        drugs.add(new Drug(3, "Фармадол", 10, "От головы"));
//        drugs.add(new Drug(4, "Фармадол", 10, "От головы"));
        this.drugs = suppliesDAO.drugs();
        return this.drugs;
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
}
