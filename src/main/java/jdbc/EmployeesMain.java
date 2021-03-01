package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesMain {


    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT emp_name FROM employees");
                ){
            List<String> names = new ArrayList<>();
            while(rs.next()){
                String name = rs.getString("emp_name");
                names.add(name);
            }
            System.out.println(names);

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot select employees", sqlException);
        }

/*
        try(
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("SELECT emp_name FROM employees WHERE id = ?")
                ) {

        } catch (SQLException sqlException) {
           throw new IllegalStateException("Cannot select", sqlException);
        }
*/

        /* Egyszerű JDBC adatmódosítás(beszúrás)

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees(emp_name) VALUES (?)"))
        {
            stmt.setString(1, "Bibi");
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }*/
    }
}
