package ro.siit.ObjectContainters;

public class Persoana implements Comparable<Persoana> {
    String name;
    int age;

    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
      public int compareTo(Persoana otherPersoana) {


        if (age > otherPersoana.age) {
            return 1;
        }
        if (age < otherPersoana.age) {
            return -1;
        }
        int compareInt = name.compareTo(otherPersoana.name);
        if (compareInt<0) return -1;
        if (compareInt>0) return 1;
        return 0;

    }

    @Override
    public String toString() {
        return "\nPersoana:" +
                "\nNume=" + name + '\'' +
                "\nVarsta=" + age ;
    }
}

