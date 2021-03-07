package covid;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    void registrationCitizensTest(){
        List<Citizen> citizens = List.of(
                new Citizen("John Doe", "9200", 43, "hello@hello.hu", "123457572"),
                new Citizen("Román Navarro", "3400", 34, "hello@hello.es", "123457620"),
                new Citizen("Tidyr Vasil", "1345", 25, "hello@hello.ua", "123457778")
        );
        covidDao.registrationCitizens(citizens);

        assertEquals(3, covidDao.registratedTajNumbers().size());
        assertEquals("123457778", covidDao.registratedTajNumbers().get(2));

    }

}