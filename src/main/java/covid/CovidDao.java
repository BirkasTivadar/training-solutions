package covid;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CovidDao {
    private DataSource dataSource;

    public CovidDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Citizen> getCitizensForVaccinationByZip(String zip) {
        List<Citizen> result = new ArrayList<>();

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("SELECT citizen_name, age, email, taj FROM citizens WHERE zip = ? AND number_of_vaccination = 0 ORDER BY age DESC, citizen_name;")
        ) {
            ps.setString(1, zip);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next() && result.size() < 16) {
                    String name = rs.getString("citizen_name");
                    int age = rs.getInt("age");
                    String email = rs.getString("email");
                    String taj = rs.getString("taj");
                    result.add(new Citizen(name, zip, age, email, taj));
                }
            } catch (SQLException sqlException) {
                throw new IllegalStateException("Cannot query", sqlException);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connection", sqlException);
        }
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
