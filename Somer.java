package ro.siit.ObjectContainters;

public class Somer extends Persoana {
    public Somer(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "\nSomer:" +
                "\nNume=" + name + '\'' +
                "\nVarsta=" + age ;
    }
}
