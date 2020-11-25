package week05d03;

import java.util.List;

public class UserValidator {

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public boolean validate(List<User> users) {
        for (User user : users) {
            if (isEmpty(user.getName())) {
                throw new IllegalArgumentException("Name must not be empty.");
            }
            if (user.getAge() < 0 || user.getAge() > 120) {
                throw new IllegalArgumentException("Age must be between 0 and 120.");
            }
        }
        return true;
    }
}
