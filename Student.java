package ro.siit.ObjectContainters;

public class Student extends Persoana {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return"\n Student:" +
                "\nNume=" + name + '\'' +
                "\nVarsta=" + age ;
    }
}
