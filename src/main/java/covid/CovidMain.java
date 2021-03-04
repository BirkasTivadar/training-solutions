package covid;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.util.List;



public class CovidMain {

    public void registrationACitizenFromConsole(DataSource dataSource) {
        Registration registration = new Registration();
        new CovidDao(dataSource).registrationOneCitizen(registration.getValidCitizenFromConsole(dataSource));
    }

    public void registrationCitizensFromFile(DataSource dataSource, String filename) {
        Registration registration = new Registration();
        List<Citizen> citizenList = registration.getValidCitizensFromFile(filename);
        new CovidDao(dataSource).registrationCitizens(citizenList);
    }

    public void writeCitizensForVaccinationToFileByZip(DataSource dataSource, String zip) {
        CovidDao covidDao = new CovidDao(dataSource);
        List<Citizen> citizens = covidDao.getCitizensForVaccinationByZip(zip);
        new CovidFileManager().writeCitizensToFile(citizens, "citizens_for_vaccinations.csv");
    }

    public static void main(String[] args) {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/covid?useUnicode=true");
        dataSource.setUser("covid");
        dataSource.setPassword("covid");
        new CovidMain().writeCitizensForVaccinationToFileByZip(dataSource, "3400");


/*

*/

/*
        new CovidMain().registrationCitizensFromFile(dataSource, "registrations.csv");
        new CovidMain().registrationACitizenFromConsole(dataSource);
*/

    }


}
