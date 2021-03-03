package covid;

public class City {
    private String zip;
    private String city_name;

    public City(String zip, String city_name) {
        this.zip = zip;
        this.city_name = city_name;
    }

    public String getZip() {
        return zip;
    }

    public String getCity_name() {
        return city_name;
    }

    @Override
    public String toString() {
        return "City{" +
                "zip='" + zip + '\'' +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}
