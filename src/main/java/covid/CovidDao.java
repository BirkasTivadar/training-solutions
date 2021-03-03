package covid;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CovidDao {
    private DataSource dataSource;

    public CovidDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void registrationOneCitizen(Citizen citizen) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);

            try (PreparedStatement ps = conn.prepareStatement("INSERT INTO citizens(citizen_name, zip, age, email, taj, number_of_vaccination) VALUES (?,?,?,?,?,?)")) {
                ps.setString(1, citizen.getName());
                ps.setString(2, citizen.getZip());
                ps.setInt(3, citizen.getAge());
                ps.setString(4, citizen.getEmail());
                ps.setString(5, citizen.getTaj());
                ps.setInt(6, citizen.getNumberOfVaccination());
                ps.executeUpdate();

                conn.commit();
            } catch (IllegalArgumentException iae) {
                conn.rollback();
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot insert", sqlException);
        }
    }

    public void registrationCitizens(List<Citizen> citizens) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);

            try (PreparedStatement ps = conn.prepareStatement("INSERT INTO citizens(citizen_name, zip, age, email, taj, number_of_vaccination) VALUES (?,?,?,?,?,?)")) {
                for (Citizen citizen : citizens) {
                    ps.setString(1, citizen.getName());
                    ps.setString(2, citizen.getZip());
                    ps.setInt(3, citizen.getAge());
                    ps.setString(4, citizen.getEmail());
                    ps.setString(5, citizen.getTaj());
                    ps.setInt(6, citizen.getNumberOfVaccination());
                    ps.executeUpdate();
                }
                conn.commit();
            } catch (IllegalArgumentException iae) {
                conn.rollback();
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot insert", sqlException);
        }
    }


    /*
    public void createCities(List<City> cities) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);

            try (PreparedStatement ps = conn.prepareStatement("INSERT INTO cities(zip, city) VALUES (?,?)")) {
                for (City city : cities) {
                    ps.setString(1, city.getZip());
                    ps.setString(2, city.getCity_name());
                    ps.executeUpdate();
                }
                conn.commit();
            } catch (IllegalArgumentException iae) {
                conn.rollback();
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot insert", sqlException);
        }
    }
*/
}
