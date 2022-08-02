package ro.siit.ObjectContainters;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Persoana> persoane = new TreeSet<>();
        Persoana p1 = new Persoana("Vicentiu Roberto", 33);
        Persoana p2 = new Persoana("Catargiu Francezu", 45);
        Persoana p3 = new Persoana("Julia Roberts" , 603);
        persoane.add(p1);
        persoane.add(p2);
        persoane.add(p3);
        for (Persoana persoana:persoane){
            System.out.println("Name: " + persoana.name + " " + "Age: " + persoana.age);
        }
    }
}

