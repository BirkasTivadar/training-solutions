package y;


import java.time.LocalDate;

public class Proba {


    public static void main(String[] args) {
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println(tomorrow+"_hello");
    }

}
