package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTest {

    private EmployeesDao employeesDao;

    @BeforeEach
    public void init() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        employeesDao = new EmployeesDao(dataSource);

        employeesDao.createEmployee("Lili");
        employeesDao.createEmployee("Bá");
        employeesDao.createEmployee("Marci");
        employeesDao.createEmployee("Lóri");
    }

    @Test
    public void listEmployeesNamesTest() {
        assertEquals(Arrays.asList("Lili", "Bá", "Marci", "Lóri"), employeesDao.listEmployeesNames());
    }

    @Test
    public void findEmployeeNameByIdTest() {
        assertEquals("Bá", employeesDao.findEmployeeNameById(2));
    }

    @Test
    public void createEmployeeGetId() {
        long id = employeesDao.createEmployee("Bibi");
        String name = employeesDao.findEmployeeNameById(id);
        assertEquals("Bibi", name);
    }

    @Test
    void createEmployeesGood() {
        List<String> names = List.of("Bibi", "Sziszi");
        employeesDao.createEmployees(names);
        assertEquals(6, employeesDao.listEmployeesNames().size());
    }

    //rollbackkel
    @Test
    void createEmployeesBad() {
        List<String> names = List.of("Bibi", "Sziszi", "Xavér");
        employeesDao.createEmployees(names);
        assertEquals(4, employeesDao.listEmployeesNames().size());
    }


}

