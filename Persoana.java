package ro.siit.ObjectContainters;

public class Persoana implements Comparable<Persoana> {
    String name;
    int age;

    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Persoana persoana) {
        return persoana.age;
    }

    }

