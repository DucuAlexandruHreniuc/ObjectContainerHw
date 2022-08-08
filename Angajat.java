package ro.siit.ObjectContainters;

public class Angajat extends Persoana{
    public Angajat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "\nAngajat:" +
                "\nNume=" + name + '\'' +
                "\nVarsta=" + age ;
    }
}
