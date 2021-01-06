package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {
    private String name;

    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
