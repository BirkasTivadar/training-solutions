package xxx;

public class TrainerMain {


    public static void main(String[] args) {
        HasName hasName = new Trainer("Bibi", 47);
        HasNameAndAge hasNameAndAge = new Trainer("Kitty", 21);

        System.out.println(hasName.getName());
        System.out.println(hasNameAndAge.getName());
        System.out.println(hasNameAndAge.getAge());
    }



}
