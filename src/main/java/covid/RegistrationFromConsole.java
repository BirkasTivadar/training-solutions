package covid;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RegistrationFromConsole {


    public Map<String, List<String>> loadMap() {
        Map<String, List<String>> cities = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(RegistrationFromConsole.class.getResourceAsStream("iranyitoszamok-varosok-2021.csv")))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String zip = line.split(";")[0];
                String city = line.split(";")[1].trim();
                if (!cities.containsKey(zip)) {
                    cities.put(zip, new ArrayList<>());
                }
                cities.get(zip).add(city);
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot load", ioException);
        }
        return cities;
    }

    public Citizen getValidCitizenFromConsole() {
        Map<String, List<String>> cities = loadMap();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a nevét:");
        String name = getValidName(scanner.nextLine());

        System.out.println("Kérem az irányítószámát:");
        String zip = getValidZip(scanner.nextLine());
        System.out.println(cities.get(zip));

        System.out.println("Kérem az életkorát:");
        int age = getValidAge(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Kérem az email címét:");
        String email1 = getValidEmail(scanner.nextLine());
        System.out.println("Kérem az email címét ismét:");
        String email2 = getValidEmail(scanner.nextLine());
        if (!email1.equals(email2)) {
            throw new IllegalArgumentException("A két email nem egyezik");
        }

        System.out.println("Kérem a TAJ számát:");
        String taj = scanner.nextLine();

        return new Citizen(name, zip, age, email1, taj);
    }

    private String getValidEmail(String email) {
        if (email.length() < 3 || !email.contains("@")) {
            throw new IllegalArgumentException("Nem email");
        }
        return email;
    }

    private boolean isNotEmpty(String str) {
        return (str != null && !str.isBlank());
    }

    private String getValidName(String name) {
        if (isNotEmpty(name)) {
            return name;
        }
        throw new IllegalArgumentException("A név nem lehet üres");
    }

    private String getValidZip(String zip) {
        try {
            Integer.parseInt(zip);
            return zip;
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Nem irányítószám");
        }
    }

    private int getValidAge(int age) {
        if (age > 10 && age < 150) {
            return age;
        }
        throw new IllegalArgumentException("Az életkor 10 és 150 év között kell legyen");
    }

    private String getvalidTAJ(String taj) {
        if (taj.length() != 9) {
            throw new IllegalArgumentException("Nem TAJ szám");
        }
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            try {
                String str = taj.substring(i, i + 1);
                int digit = Integer.parseInt(str);
                if (i % 2 == 0) {
                    sum += digit * 3;
                } else {
                    sum += digit * 7;
                }
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Ez nem karakter nem számjegy" + taj.substring(i, i + 1), nfe);
            }
        }
        if (Integer.parseInt(taj.substring(8)) == sum % 10) {
            return taj;
        }
        throw new IllegalArgumentException("Rossz TAJ szám");
    }


    public static void main(String[] args) {
        RegistrationFromConsole registrationFromConsole = new RegistrationFromConsole();
        System.out.println(registrationFromConsole.getValidCitizenFromConsole());

    }
}


