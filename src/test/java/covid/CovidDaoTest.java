package covid;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import java.util.List;

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
        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Josif Várszegi", "3400", 45, "hello@hello.ro", "123458476"),
                new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 1, LocalDateTime.of(2021, 3, 4, 10, 0, 0)),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);

        assertEquals(2, covidDao.getCitizensForVaccinationByZip("3400").size());
        assertEquals(1, covidDao.getCitizensForVaccinationByZip("9200").size());
        assertEquals(0, covidDao.getCitizensForVaccinationByZip("6600").size());
        assertTrue(covidDao.getCitizensForVaccinationByZip("3400").contains(new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620")));
        assertFalse(covidDao.getCitizensForVaccinationByZip("3400").contains(new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 1, LocalDateTime.of(2021, 3, 4, 10, 0, 0))));
    }

    @Test
    void getCitizensForVaccinationByZipAndNumberOfVaccinationAndLastVaccinationDateTest() {
        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Josif Várszegi", "3400", 45, "hello@hello.ro", "123458476", 1, LocalDateTime.of(2021,2,4,10,0,0)),
                new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 1, LocalDateTime.of(2021, 3, 4, 10, 0, 0)),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);

        assertEquals(2, covidDao.getCitizensForVaccinationByZip("3400").size());
        assertEquals(1, covidDao.getCitizensForVaccinationByZip("9200").size());
        assertEquals(0, covidDao.getCitizensForVaccinationByZip("6600").size());
        assertTrue(covidDao.getCitizensForVaccinationByZip("3400").contains(new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620")));
        assertFalse(covidDao.getCitizensForVaccinationByZip("3400").contains(new Citizen("Birkás Tivadar", "3400", 47, "hello@hello.me", "123458311", 1, LocalDateTime.of(2021, 3, 4, 10, 0, 0))));
    }


//    public List<Citizen> getCitizensForVaccinationByZip(String zip) {
//        List<Citizen> result = new ArrayList<>();
//
//        try (
//                Connection conn = dataSource.getConnection();
//                PreparedStatement ps = conn.prepareStatement("SELECT citizen_name, age, email, taj FROM citizens WHERE zip = ? AND number_of_vaccination = 0 OR last_vaccination < ? ORDER BY age DESC, citizen_name;")
//        ) {
//            LocalDateTime lastCheck = LocalDateTime.now().minusDays(15);
//            ps.setString(1, zip);
//            ps.setTimestamp(2, Timestamp.valueOf(lastCheck));
//            try (ResultSet rs = ps.executeQuery()) {
//                while (rs.next() && result.size() < 16) {
//                    String name = rs.getString("citizen_name");
//                    int age = rs.getInt("age");
//                    String email = rs.getString("email");
//                    String taj = rs.getString("taj");
//                    result.add(new Citizen(name, zip, age, email, taj));
//                }
//            } catch (SQLException sqlException) {
//                throw new IllegalStateException("Cannot query", sqlException);
//            }
//            return result;
//        } catch (SQLException sqlException) {
//            throw new IllegalStateException("Cannot connection", sqlException);
//        }
//    }

}