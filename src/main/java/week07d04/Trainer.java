package week07d04;

public class Trainer extends Human{
    private String profession;

    public Trainer(String name, int age, String profession) {
        super(name, age);
        this.profession = profession;
    }

    @Override
    public void work() {
        System.out.println("Do: " +profession);
    }

    public static void main(String[] args) {
        Human human = new Trainer("Jóska", 45, "tailor");
        human.work();
    }
}
