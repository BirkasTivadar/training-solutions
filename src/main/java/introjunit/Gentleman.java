package introjunit;

public class Gentleman {

    public String sayHello(String name) {
        return name == null ? "Hello Anonymus" : "Hello " + name;
//        if (name == null) {
//            return "Hello Anonymus";
//        } else {
//            return "Hello " + name;
//        }
    }

}
