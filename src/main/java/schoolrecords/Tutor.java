package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {
    private String name;
    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> taughtSubjects) {
        if (isBlank(name)) {
            throw new IllegalArgumentException("Name must not be empty!");
        }
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject taughtSubject : taughtSubjects) {
            if (taughtSubject.getSubjectName().equals(subject.getSubjectName())) {
                return true;
            }
        }
        return false;
    }

    private boolean isBlank(String string) {
        return string == null || string.isBlank();
    }
}
