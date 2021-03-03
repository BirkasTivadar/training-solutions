package covid;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.util.List;

public class CovidMain {

    public void registrationACitizenFromConsole(DataSource dataSource) {
        CovidDao covidDao = new CovidDao(dataSource);
        Registration registration = new Registration();
        covidDao.registrationOneCitizen(registration.getValidCitizenFromConsole());
    }

    public void registrationCitizensFromFile(DataSource dataSource, String filename){
        Registration registration = new Registration();
        List<Citizen> citizenList = registration.getValidCitizensFromFile(filename);
        CovidDao covidDao = new CovidDao(dataSource);
        covidDao.registrationCitizens(citizenList);
    }

    public static void main(String[] args) {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/covid?useUnicode=true");
        dataSource.setUser("covid");
        dataSource.setPassword("covid");

        CovidMain covidMain = new CovidMain();
        covidMain.registrationCitizensFromFile(dataSource, "RegistrationTest.csv");
        covidMain.registrationACitizenFromConsole(dataSource);



    }


}
