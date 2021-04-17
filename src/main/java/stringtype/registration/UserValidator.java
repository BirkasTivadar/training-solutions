package stringtype.registration;

public class UserValidator {

    public boolean isValidUsername(String username) {
        return !isEmpty(username);
    }

    private boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    public boolean isValidPassword(String password1, String password2) {
        boolean passwordTrue = password1.length() > 7;
        return (passwordTrue && password1.equals(password2));
    }

    public boolean isValidEmail(String email) {
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".", atIndex);
        return (atIndex > 0) && (dotIndex < email.length() - 1) && ((dotIndex - atIndex) > 1);
    }

}
