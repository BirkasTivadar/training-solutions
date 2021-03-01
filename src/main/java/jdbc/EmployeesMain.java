package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

public class EmployeesMain {


    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        EmployeesDao employeesDao = new EmployeesDao(dataSource);
     //   employeesDao.createEmployee("Bibó");
        System.out.println(employeesDao.listEmployeesNames());
        System.out.println(employeesDao.findEmployeeNameById(3));





/* Sima create szimpla Statementtel

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees(emp_name) VALUES (?)"))
        {
            stmt.setString(1, "Bibi");
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }

 */
    }
}
