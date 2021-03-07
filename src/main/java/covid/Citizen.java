package covid;

import java.time.LocalDateTime;
import java.util.Objects;

public class Citizen {

    private String name;
    private String zip;
    private int age;
    private String email;
    private String taj;
    private int numberOfVaccination = 0;
    private LocalDateTime last_vaccination = LocalDateTime.of(2000,1,1,0,0,0);

    public Citizen(String name, String zip, int age, String email, String taj, int numberOfVaccination, LocalDateTime last_vaccination) {
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
        this.numberOfVaccination = numberOfVaccination;
        this.last_vaccination = last_vaccination;
    }

    public Citizen(String taj, int numberOfVaccination, LocalDateTime last_vaccination) {
        this.taj = taj;
        this.numberOfVaccination = numberOfVaccination;
        this.last_vaccination = last_vaccination;
    }

    public Citizen() {
    }

    public Citizen(String name, String zip, int age, String email, String taj) {
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
    }



    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public int getNumberOfVaccination() {
        return numberOfVaccination;
    }

    public LocalDateTime getLast_vaccination() {
        return last_vaccination;
    }

    public void giveVaccination() {
        numberOfVaccination++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return Objects.equals(taj, citizen.taj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taj);
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", zip='" + zip + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", taj='" + taj + '\'' +
                ", numberOfVaccination=" + numberOfVaccination +
                ", last_vaccination=" + last_vaccination +
                "}\n";
    }

}
