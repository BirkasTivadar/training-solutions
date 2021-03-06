package y;


import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;

public class Proba {

    public int inFifteenDays(DataSource dataSource, String taj){
        int result = 5;
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("SELECT COUNT(zip) FROM citizens WHERE taj = ? AND last_vaccination < ?;")
        ) {
            LocalDateTime lastCheck = LocalDateTime.now().minusDays(15);
            ps.setString(1, taj);
            ps.setTimestamp(2, Timestamp.valueOf(lastCheck));
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    result = rs.getInt(1);
                }
            } catch (SQLException sqlException) {
                throw new IllegalStateException("Cannot query", sqlException);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connection", sqlException);
        }
    }

    public static void main(String[] args) {

        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/covid?useUnicode=true");
        dataSource.setUser("covid");
        dataSource.setPassword("covid");

        Proba proba = new Proba();
        System.out.println(proba.inFifteenDays(dataSource, "123456922"));

    }
}
