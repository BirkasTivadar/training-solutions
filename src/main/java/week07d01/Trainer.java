package week07d01;

public class Trainer {

    private static int numberOfTrainer;

    public static int getNumberOfTrainer() {
        return numberOfTrainer;
    }

    private String name;

    public Trainer(String name) {
        this.name = name;
        numberOfTrainer++;
    }

    public String getName() {
        return name;
    }


}
