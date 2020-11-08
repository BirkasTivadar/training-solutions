package references.parameters;

public class PersonMain {

    public static void main(String[] args) {
        Person bibi = new Person("Bibi", 47);
        Person tiva = bibi;

        tiva.setName("Tiva");

        System.out.println(bibi.getName());
        System.out.println(tiva.getName());

        int a = 24;
        int b = a;
        b++;
        System.out.println(a);
        System.out.println(b);

        Person lali = new Person("lali", 25);
        tiva = lali;
        System.out.println(lali.getName());
        System.out.println(tiva.getName());
        System.out.println(bibi.getName());

    }
}
