package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;

import java.util.Arrays;

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
        assertEquals(Arrays.asList("Lili","Bá","Marci","Lóri"), employeesDao.listEmployeesNames());
    }

    @Test
    public void findEmployeeNameByIdTest(){
        assertEquals("Bá", employeesDao.findEmployeeNameById(2));
    }


}

