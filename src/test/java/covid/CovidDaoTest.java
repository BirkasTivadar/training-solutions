package covid;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.time.LocalDateTime;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CovidDaoTest {

    private CovidDao covidDao;

    @BeforeEach
    public void init() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/covid?useUnicode=true");
        dataSource.setUser("covid");
        dataSource.setPassword("covid");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        covidDao = new CovidDao(dataSource);
    }

    @Test
    void loadCitiesTest() {
        Map<String, List<String>> cites = covidDao.loadCities();
        assertEquals(2801, cites.size());
    }

    @Test
    void registrationOneCitizenTest() {
        Citizen john = new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572");
        covidDao.registrationOneCitizen(john);
        assertEquals("123457572", covidDao.registratedTajNumbers().get(0));
    }

    @Test
    void registrationCitizensTest() {
        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);

        assertEquals(3, covidDao.registratedTajNumbers().size());
        assertEquals("123457778", covidDao.registratedTajNumbers().get(2));
    }

    @Test
    void getCitizensForVaccinationByZipTest() {
        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Josif Várszegi", "3400", 45, "hello@hello.ro", "123458476"),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);

        assertEquals(2, covidDao.getCitizensForVaccinationByZip("3400").size());
        assertEquals(1, covidDao.getCitizensForVaccinationByZip("9200").size());
        assertEquals(0, covidDao.getCitizensForVaccinationByZip("6600").size());
        assertTrue(covidDao.getCitizensForVaccinationByZip("3400").contains(new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620")));
    }

    @Test
    void getCitizensForVaccinationByZipAndNumberOfVaccinationTest() {
        LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Josif Várszegi", "3400", 45, "hello@hello.ro", "123458476"),
                new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 1, yesterday),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);

        assertEquals(2, covidDao.getCitizensForVaccinationByZip("3400").size());
        assertEquals(1, covidDao.getCitizensForVaccinationByZip("9200").size());
        assertEquals(0, covidDao.getCitizensForVaccinationByZip("6600").size());
        assertTrue(covidDao.getCitizensForVaccinationByZip("3400").contains(new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620")));
        assertFalse(covidDao.getCitizensForVaccinationByZip("3400").contains(new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 1, yesterday)));
    }

    @Test
    void getCitizensForVaccinationByZipAndNumberOfVaccinationAndLastVaccinationDateTest() {
        LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
        LocalDateTime beforeAMonth = LocalDateTime.now().minusMonths(1);

        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Josif Várszegi", "3400", 45, "hello@hello.ro", "123458476", 1, beforeAMonth),
                new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 1, yesterday),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);

        assertEquals(2, covidDao.getCitizensForVaccinationByZip("3400").size());
        assertEquals(1, covidDao.getCitizensForVaccinationByZip("9200").size());
        assertEquals(0, covidDao.getCitizensForVaccinationByZip("6600").size());
        assertTrue(covidDao.getCitizensForVaccinationByZip("3400").contains(new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620")));
        assertFalse(covidDao.getCitizensForVaccinationByZip("3400").contains(new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 1, yesterday)));
    }

    @Test
    void infoBeforeVaccinationTest() {
        LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
        LocalDateTime beforeAMonth = LocalDateTime.now().minusMonths(1);
        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Josif Várszegi", "3400", 45, "hello@hello.ro", "123458476", 1, beforeAMonth),
                new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 2, yesterday),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);
        assertEquals(0, covidDao.infoBeforeVaccination("123457572"));
        assertEquals(2, covidDao.infoBeforeVaccination("123458311"));
        assertEquals(0, covidDao.infoBeforeVaccination("123457778"));
        assertEquals(1, covidDao.infoBeforeVaccination("123458476"));
    }

    @Test
    void inFifteenDaysTest() {
        LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
        LocalDateTime beforeAMonth = LocalDateTime.now().minusMonths(1);
        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Josif Várszegi", "3400", 45, "hello@hello.ro", "123458476", 1, beforeAMonth),
                new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 2, yesterday),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);
        assertEquals(1, covidDao.inFifteenDays("123457572"));
        assertEquals(1, covidDao.inFifteenDays("123458476"));
        assertEquals(0, covidDao.inFifteenDays("123458311"));
    }


    @Test
    void adminVaccinationAndIfHasVaccinationTest() {
        LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
        LocalDateTime beforeAMonth = LocalDateTime.now().minusMonths(1);
        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);

        Vaccine vaccineJohn = new Vaccine("123457572", beforeAMonth, VaccinationStatus.SUCCESSFUL, Vaccine_Type.SINOPHARM);
        covidDao.adminVaccination(vaccineJohn);

        assertEquals(Vaccine_Type.SINOPHARM, covidDao.ifHasVaccination("123457572"));
        assertEquals(1, covidDao.getCitizenByTaj("123457572").getNumberOfVaccination());
        assertEquals(0, covidDao.getCitizenByTaj("123457778").getNumberOfVaccination());

        Vaccine vaccineJohn2 = new Vaccine("123457572", yesterday, VaccinationStatus.SUCCESSFUL, Vaccine_Type.SINOPHARM);
        Vaccine vaccineTidyr = new Vaccine("123457778", yesterday, VaccinationStatus.SUCCESSFUL, Vaccine_Type.MODERNA);
        covidDao.adminVaccination(vaccineJohn2);
        covidDao.adminVaccination(vaccineTidyr);
        assertEquals(Vaccine_Type.MODERNA, covidDao.ifHasVaccination("123457778"));
        assertEquals(2, covidDao.getCitizenByTaj("123457572").getNumberOfVaccination());
        assertEquals(1, covidDao.getCitizenByTaj("123457778").getNumberOfVaccination());
    }


}