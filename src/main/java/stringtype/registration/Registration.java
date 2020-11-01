package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a felhasználónevet.");
        String username = scanner.nextLine();

        System.out.println("Kérem a jelszót.");
        String password1 = scanner.nextLine();

        System.out.println("Kérem erősítse meg a jelszót.");
        String password2 = scanner.nextLine();

        System.out.println("Kérem az email címet.");
        String email = scanner.nextLine();

        UserValidator userValidator = new UserValidator(username, password1, password2, email);

        System.out.print("A felhasználónév ");
        System.out.println(userValidator.isValidUsername() ? "jó." : "nem jó.");

        System.out.print("A jelszó ");
        System.out.println(userValidator.isValidPassword() ? "jó." : "nem jó.");

        System.out.print("Az email cím ");
        System.out.println(userValidator.isValidEmail() ? "jó." : "nem jó.");

    }
}
