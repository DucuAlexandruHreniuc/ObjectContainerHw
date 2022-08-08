package ro.siit.ObjectContainters;



public class Adresa {
    String streetName;
    String cityName;
    String countryName;


    public Adresa(String streetName, String cityName, String countryName) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "\nAdresa{" +
                "streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}

