package iofilestest.cheese;

public class Cheese {
    private String name;
    private double lactoseContent;

    public Cheese(String name, double lactoseContent) {
        this.name = name;
        this.lactoseContent = lactoseContent;
    }

    public String getName() {
        return name;
    }

    public double getLactoseContent() {
        return lactoseContent;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                ", lactoseContent=" + lactoseContent +
                '}';
    }
}
