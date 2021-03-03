package covid;


import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Registration {

    public List<Citizen> getValidCitizensFromFile(String fileName) {
        Path file = Path.of(fileName);
        List<Citizen> result = new ArrayList<>();
        List<Citizen> wrong = new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] lineArr = line.split(";");
                if (isvalidCitizen(lineArr)) {
                    result.add(new Citizen(lineArr[0], lineArr[1], Integer.parseInt(lineArr[2]), lineArr[3], lineArr[4]));
                } else {
                    wrong.add(new Citizen(lineArr[0], lineArr[1], Integer.parseInt(lineArr[2]), lineArr[3], lineArr[4]));
                }
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot load", ioException);
        }
        System.out.println("Az alábbi személyek regisztrációja rossz adat miatt meghiúsult:");
        System.out.println(wrong);
        return result;
    }

    public boolean isvalidCitizen(String[] lineArr) {
        return (isValidName(lineArr[0]) && isValidZip(lineArr[1]) && isValidAge(lineArr[2]) && isValidEmail(lineArr[3]) && isvalidTAJ(lineArr[4]));
    }

    public Citizen getValidCitizenFromConsole(DataSource dataSource) {
        Map<String, List<String>> cities = new CovidDao(dataSource).loadCities();
        Scanner scanner = new Scanner(System.in);

        String name = readName(scanner);

        String zip = readZip(scanner);
        System.out.println(cities.get(zip));

        int age = readAge(scanner);

        String email = readEmail(scanner);

        String taj = readTAJ(scanner);

        return new Citizen(name, zip, age, email, taj);
    }


    private String readName(Scanner scanner) {
        System.out.println("Kérem a nevét:");
        String name = scanner.nextLine();
        while (!isValidName(name)) {
            System.out.println("A név nem lehet üres!");
            System.out.println("Kérem a nevét:");
            name = scanner.nextLine();
        }
        return name;
    }

    private boolean isValidName(String name) {
        return isNotEmpty(name);
    }

    private boolean isNotEmpty(String str) {
        return (str != null && !str.isBlank());
    }


    private String readZip(Scanner scanner) {
        System.out.println("Kérem az irányítószámát:");
        String zip = scanner.nextLine();
        while (!isValidZip(zip)) {
            System.out.println("Nem irányítószám!");
            System.out.println("Kérem az irányítószámát:");
            zip = scanner.nextLine();
        }
        return zip;
    }

    private boolean isValidZip(String zip) {
        try {
            Integer.parseInt(zip);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


    private int readAge(Scanner scanner) {
        System.out.println("Kérem az életkorát:");
        String age = scanner.nextLine();
        while (!isValidAge(age)) {
            System.out.println("Az életkor 10 és 150 év között kell legyen!");
            System.out.println("Kérem az életkorát:");
            age = scanner.nextLine();
        }
        return Integer.parseInt(age);
    }

    private boolean isValidAge(String age) {
        try {
            int temp = Integer.parseInt(age);
            if (temp > 10 && temp < 150) {
                return true;
            }
            return false;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


    private String readEmail(Scanner scanner) {
        System.out.println("Kérem az email címét:");
        String email1 = scanner.nextLine();
        while (!isValidEmail(email1)) {
            System.out.println("Nem email cím!");
            System.out.println("Kérem az email címét:");
            email1 = scanner.nextLine();
        }

        System.out.println("Kérem az email címét ismét:");
        String email2 = scanner.nextLine();
        while (!email2.equals(email1)) {
            System.out.println("A két email cím nem egyezik!");
            System.out.println("Kérem az email címét ismét:");
            email2 = scanner.nextLine();
        }
        return email1;
    }

    private boolean isValidEmail(String email) {
        return (email.length() >= 3 && email.contains("@"));
    }


    private String readTAJ(Scanner scanner) {
        System.out.println("Kérem a TAJ számát:");
        String taj = scanner.nextLine();
        while (!isvalidTAJ(taj)) {
            System.out.println("Nem TAJ szám!");
            System.out.println("Kérem a TAJ számát:");
            taj = scanner.nextLine();
        }
        return taj;
    }

    private boolean isvalidTAJ(String taj) {
        if (taj.length() != 9) {
            return false;
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
                return false;
            }
        }
        if (Integer.parseInt(taj.substring(8)) == sum % 10) {
            return true;
        }
        return false;
    }

    /* Először fájlból töltöttem fel a Map-et, de alkalmazás közben adatbázisból dolgozunk nem fájlból.
        public Map<String, List<String>> loadMap() {
            Map<String, List<String>> cities = new HashMap<>();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(Registration.class.getResourceAsStream("zip2021.csv")))) {
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


    // Be kellett töltenem a cities táblát Java-n keresztül, mert nem importálja ez a gép valamiért.
    public List<City> loadCityList() {
        List<City> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(RegistrationFromConsole.class.getResourceAsStream("zip2021.csv")))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] lineArr = line.split(";");
                String zip = lineArr[0];
                String city = lineArr[1].trim();
                if (lineArr.length == 3) {
                    city = city.concat("-").concat(lineArr[2]);
                }
                result.add(new City(zip, city));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot load", ioException);
        }
        return result;
    }

    public static void main(String[] args) {

        RegistrationFromConsole registrationFromConsole = new RegistrationFromConsole();
        List<City> cities = registrationFromConsole.loadCityList();

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/covid?useUnicode=true");
        dataSource.setUser("covid");
        dataSource.setPassword("covid");

        CovidDao covidDao = new CovidDao(dataSource);
        covidDao.createCities(cities);
    }
 */
}


