package finalmodifier;

public class Gentleman {

    private final String MESSAGE_PREFIX;

    public Gentleman(String MESSAGE_PREFIX) {
        this.MESSAGE_PREFIX = MESSAGE_PREFIX;
    }

    public String sayHello(String name){
        return MESSAGE_PREFIX + name + "!";
    }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman("Hello ");
        System.out.println(gentleman.sayHello("Joe"));
    }
}
