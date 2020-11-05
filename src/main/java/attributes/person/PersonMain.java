package attributes.person;

public class PersonMain {

    public static void main(String[] args) {
        Address address = new Address("Hungary", "Győr", "Lomnic u. 26", "9024");
        System.out.println(address.addressToString());

        Person person = new Person("Bibi", "456789AF");
        System.out.println(person.personToString());
        System.out.println(person.getAddress());
        System.out.println();

        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());
        System.out.println();

        System.out.println(person.getName());
        System.out.println(person.getAddress().getCity());
    }

}

