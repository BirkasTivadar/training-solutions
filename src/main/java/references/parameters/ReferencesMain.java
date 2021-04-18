package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person bibi = new Person("Bibi", 47);

        Person tiva = bibi;

        tiva.setName("Tiva");

        System.out.println(bibi.getName());
        System.out.println(tiva.getName() + "\n");

        int a = 24;
        int b = a;
        b++;

        System.out.println(a);
        System.out.println(b + "\n");

        Person lali = new Person("lali", 25);

        tiva = lali;

        System.out.println(lali.getName());
        System.out.println(tiva.getName());
        System.out.println(bibi.getName());
    }
}
