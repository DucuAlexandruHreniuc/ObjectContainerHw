package ro.siit.ObjectContainters;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        TreeSet<Persoana> persoane = new TreeSet<>();
        Persoana p1 = new Persoana("Vicentiu Roberto", 49);
        Persoana p2 = new Persoana("Catargiu Francezu", 49);
        Persoana p3 = new Persoana("Julia Roberts" , 603);
        Somer p4 = new Somer("Giovanni Giorgio", 25);
        persoane.add(p1);
        persoane.add(p2);
        persoane.add(p3);
        persoane.add(p4);
        for (Persoana persoana:persoane){
            System.out.println("Name: " + persoana.name + " " + "Age: " + persoana.age);
        }
        HashMap<Persoana, List<Hobby>> map = new HashMap<>();
        map.put(p1, Arrays.asList(new Hobby("Swimming" , 2 , new Adresa("Cernei" , "Cluj", "Cluj"))));
        map.put(p4, Arrays.asList(new Hobby("Cycling", 5 , new Adresa("Garoafelor" , "Bucuresti", "Romania") )));
        System.out.println(map);




            



    }
}

