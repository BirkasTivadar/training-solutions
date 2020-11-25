package week05d03;

import java.util.List;

public class UserValidator {

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public boolean validate(List<User> users) {
        if(users == null){
            throw new NullPointerException("Users must be not null");
        }
        for (User user : users) {
            if(user == null){
                throw new NullPointerException("User must be not null");
            }
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
