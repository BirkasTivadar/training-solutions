package x;

public class Course implements HasName {
    private String name;

    @Override
    public String getName() {
        return name;
    }

    public Course(String name) {
        this.name = name;
    }
}
