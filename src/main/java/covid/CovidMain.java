package covid;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.util.List;
import java.util.Scanner;


public class CovidMain {

    private DataSource dataSource;

    public CovidMain(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void registrationACitizenFromConsole(DataSource dataSource) {
        Registration registration = new Registration();
        new CovidDao(dataSource).registrationOneCitizen(registration.getValidCitizenFromConsole(dataSource));
    }

    public void registrationCitizensFromFile(DataSource dataSource) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem írja be a fájlnevet:");
        String filename = scanner.nextLine();

        Registration registration = new Registration();
        List<Citizen> citizenList = registration.getValidCitizensFromFile(filename);
        new CovidDao(dataSource).registrationCitizens(citizenList);
    }

    public void writeCitizensForVaccinationToFileByZip(DataSource dataSource) {
        Scanner scanner = new Scanner(System.in);
        String zip = new Registration().readZip(scanner);
        System.out.println("Kérem írja be a fájlnevet:");
        String filename = scanner.nextLine();

        CovidDao covidDao = new CovidDao(dataSource);
        List<Citizen> citizens = covidDao.getCitizensForVaccinationByZip(zip);
        new Registration().writeCitizensToFile(citizens, filename);
    }

    private void vaccination() {
        Vaccine vaccine = new Registration().administrationVaccine(dataSource);
        new CovidDao(dataSource).adminVaccination(vaccine);
    }

    public void menuToConsole() {
        System.out.println("1. Regisztráció\n" +
                "2. Tömeges regisztráció\n" +
                "3. Generálás\n" +
                "4. Oltás\n" +
                "5. Oltás meghiúsulás\n" +
                "6. Riport\n" + "\n" +
                "7. Kilépés");
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int menuNumber = 0;
        while (menuNumber != 7) {
            menuToConsole();
            System.out.println("Kérem adja meg a menü számát:");
            try {
                menuNumber = Integer.parseInt(scanner.nextLine());
                executeMenu(menuNumber);
            } catch (NumberFormatException nfe) {
                System.out.println("Nyomatékosan kérem egy egész számot adjon meg 1 és 7 között!");
            } catch (IllegalArgumentException | ArithmeticException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }

    private void executeMenu(int menuNumber) {
        switch (menuNumber) {
            case 1: {
                registrationACitizenFromConsole(dataSource);
                return;
            }
            case 2: {
                registrationCitizensFromFile(dataSource);
                return;
            }
            case 3: {
                writeCitizensForVaccinationToFileByZip(dataSource);
                return;
            }
            case 4: {
                vaccination();
                return;
            }
             case 6: {
                System.out.println("Kidolgozás alatt");;
                return;
            }
            case 7: {
                System.out.println("A viszon'lágytojás!");;
                return;
            }

            default: {
                System.out.println("Nem létezik ilyen menüpont!");
            }
        }
    }



    public static void main(String[] args) {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/covid?useUnicode=true");
        dataSource.setUser("covid");
        dataSource.setPassword("covid");

        CovidMain covidMain = new CovidMain(dataSource);

    //   System.out.println(new CovidDao(dataSource).infoBeforeVaccination("123458304"));

       covidMain.runMenu();


/*
        new CovidMain().writeCitizensForVaccinationToFileByZip(dataSource, "3400");

*/

/*
        new CovidMain().registrationCitizensFromFile(dataSource, "registrations.csv");
        new CovidMain().registrationACitizenFromConsole(dataSource);
*/

    }


}
