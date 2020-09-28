import java.util.ArrayList;
import java.util.Scanner;

public class Ispit {

    public static void main(String[] args) {

        Ocene o1=new Ocene(97,0,"Poliglupija", "Jaguar");
        Ocene o2=new Ocene(37,0,"Poliglupija", "Jaguar");
        Ocene o3=new Ocene(87,0,"Poliglupija", "Jaguar");

//        System.out.println(o1.toString());
 //       System.out.println(o1.izracunajOcenu());
        o1.setOcena(o1.izracunajOcenu());
 //       System.out.println(o2.izracunajOcenu());
        o2.setOcena(o2.izracunajOcenu());
 //       System.out.println(o3.izracunajOcenu());
        o3.setOcena(o3.izracunajOcenu());

//        System.out.println(o1.toString());

        ArrayList<Ocene> lista=new ArrayList<>();
        lista.add(o1);
        lista.add(o2);
        lista.add(o3);
        System.out.println("Prosek je: " +o1.izracunajProsek(lista));

    }
}
