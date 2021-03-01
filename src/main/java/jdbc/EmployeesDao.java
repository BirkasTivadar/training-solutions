package jdbc;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeesDao {
    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createEmployee(String name) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("INSERT INTO employees(emp_name) VALUES (?)")
        ) {
            ps.setString(1, name);
            ps.executeUpdate();
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot create", sqlException);
        }
    }

    public List<String> listEmployeesNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT emp_name FROM employees")
        ) {
            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot select all");
        }
    }

    public String findEmployeeNameById(long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("SELECT emp_name FROM employees WHERE id = ?");
        ) {
            ps.setLong(1, id);
            return selectEmployeeNameById(ps);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connection", sqlException);
        }
    }

    private String selectEmployeeNameById(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("emp_name");
                return name;
            }
            throw new IllegalArgumentException("Wrong id");
        } catch (SQLException sqlException){
            throw new IllegalStateException("Cannot query", sqlException);
        }
    }
}
