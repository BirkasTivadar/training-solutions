package schoolrecords;

import java.util.Objects;

public class Subject {

    private String subjectName;

    public Subject(String subjectName) {
        if (isBlank(subjectName)) {
            throw new IllegalArgumentException("Subjectname must not be empty");
        }
        this.subjectName = subjectName;
    }

    private boolean isBlank(String string) {
        return string == null || string.isBlank();
    }

    public String getSubjectName() {
        return subjectName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(subjectName, subject.subjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectName);
    }
}


