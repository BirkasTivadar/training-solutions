package attributes.person;

public class PersonMain {

    public static void main(String[] args) {
        Address address = new Address("Hungary", "Győr", "Lomnic u. 26", "9024");

        System.out.println(address.addressToString() + "\n");

        Person person = new Person("Bibi", "456789AF");

        System.out.println(person.personToString());

        System.out.println(person.getAddress() + "\n");

        person.moveTo(address);

        System.out.println(person.personToString());

        System.out.println(person.getAddress().addressToString() + "\n");

        System.out.println(person.getName());

        System.out.println(person.getAddress().getCity());
    }
}

