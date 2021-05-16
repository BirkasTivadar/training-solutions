package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;

    private List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        if (isBlank(name)) {
            throw new IllegalArgumentException("Name must not be empty!");
        }
        this.name = name;
        this.taughtSubjects = new ArrayList<>(taughtSubjects);
    }

    public String getName() {
        return name;
    }

    public List<Subject> getTaughtSubjects() {
        return new ArrayList<>(taughtSubjects);
    }

    public boolean tutorTeachingSubject(Subject subject) {
        return taughtSubjects.stream().anyMatch(e -> e.equals(subject));
    }

    private boolean isBlank(String string) {
        return string == null || string.isBlank();
    }
}
