package stringtype.registration;

public class UserValidator {
    private String username;
    private String password1;
    private String password2;
    private String email;

    public UserValidator(String username, String password1, String password2, String email) {
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
        this.email = email;
    }

    public boolean isValidUsername() {
        return (username != "" && username != null);
    }

    public boolean isValidPassword() {
        boolean password1True = password1.length() > 7;
        boolean password2True = password2.length() > 7;
        return (password1True && password2True && password1.equals(password2));
    }

    public boolean isValidEmail() {
        int kukacIndex = email.indexOf("@");
        int pontIndex = email.indexOf(".");
        return (kukacIndex > 0) && (pontIndex < email.length()-1) && ((pontIndex - kukacIndex) > 1);
    }

}
