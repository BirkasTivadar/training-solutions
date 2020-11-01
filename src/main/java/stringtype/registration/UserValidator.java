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

    public boolean isValidUsername(String username) {
        return (username != "" || username != null);
    }

    public boolean isValidPassword(String password1, String password2) {
        boolean password1True = password1.length() > 7;
        boolean password2True = password2.length() > 7;
        return (password1True && password2True && password1.equals(password2));
    }

    public boolean isValidEmail(String email) {
        int kukacIndex = email.indexOf("@");
        int pontIndex = email.indexOf(".");
        boolean kukacTrue = (kukacIndex > 0);
        boolean pontTrue = (pontIndex < email.length()-1);
        boolean kukacEsPontTrue = (pontIndex - kukacIndex) > 1;
        return kukacTrue && pontTrue && kukacEsPontTrue;
    }

}
