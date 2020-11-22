package schoolrecords;

public class Subject {
    private String subjectName;

    public Subject(String subjectName) {
        if (isBlank(subjectName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    private boolean isBlank(String string) {
        return string == null || string.isBlank();
    }

}


