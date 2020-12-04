package week06d05;

public class Trainer {

    private String name;
    private int age;

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        Trainer trainer = new TrainerBuilder()
                .withName("Bibi")
                .withAge(20)
                .build();

        System.out.println(trainer.getAge());
        System.out.println(trainer.getName());
    }

}
