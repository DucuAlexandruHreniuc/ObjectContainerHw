package ro.siit.ObjectContainters;



public class Hobby {
    public Hobby(String hobbyName, int frequency, Adresa adresa) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.adresa = adresa;
    }

    String hobbyName;
    int frequency;
    Adresa adresa;

    @Override
    public String toString() {
        return "\nHobbyName= " + hobbyName + '\'' +
                "\nFrequency =" + frequency +
                "\nAdresa: " + adresa ;
    }
}
