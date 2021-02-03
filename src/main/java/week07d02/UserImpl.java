package week07d02;

public class UserImpl implements User {
    private String username;
    private String firstName;
    private String lastName;

    public UserImpl(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public static void main(String[] args) {
        UserImpl user = new UserImpl("málaga", "Birkás", "Tivadar");
        System.out.println(user.getFullName());

        User user1 = User.of("helloJava", "José", "Armando");
        System.out.println(user1.getFullName());
    }


}
