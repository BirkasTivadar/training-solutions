package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindByIdMain {

    public void selectNameById(MysqlDataSource dataSource, long id) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("SELECT emp_name FROM employees WHERE id = ?")
        ) {
            ps.setLong(1, id);
            selectNameByPreparedStatement(ps);
        } catch (
                SQLException sqlException) {
            throw new IllegalStateException("Cannot select", sqlException);
        }
    }

    private void selectNameByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("emp_name");
                System.out.println(name);
            }
            throw new IllegalArgumentException("Wrong id");
        } catch (SQLException sqlException){
            throw new IllegalStateException("Cannot query", sqlException);
        }
    }

    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        FindByIdMain findByIdMain = new FindByIdMain();
        findByIdMain.selectNameById(dataSource, 2);
    }

}