package PageTest;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="themeService", eager = true)
@ApplicationScoped
public class ThemeService {

    private List<Theme> themes;

    @PostConstruct
    public void init() {
        themes = new ArrayList<Theme>();
        themes.add(new Theme(0, "На холестерин", "cholesterol"));
        themes.add(new Theme(1, "На гемоглобин", "hemoglobin"));
        themes.add(new Theme(2, "Давление", "pressure"));
        themes.add(new Theme(3, "Анализы", "analis"));
    }

    public List<Theme> getThemes() {
        return themes;
    }
}
