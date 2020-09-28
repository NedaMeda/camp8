
import java.util.Scanner;

public class GlavniProgramAutomobil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Automobil a1 = new Automobil( "Audi", "A3", 12345, 5);
        a1.setVlasnik("Pera Peric");
        System.out.println(a1.getMarka());
        System.out.println(a1.getModel());
        System.out.println(a1.getSerBr());
        System.out.println(a1.getVlasnik());

        Automobil a2 = new Automobil("Alfa", "GT", 6789, 4);
        a2.setVlasnik("Mika Mikic");
        System.out.println(a2.getMarka());
        System.out.println(a2.getModel());
        System.out.println(a2.getSerBr());
        System.out.println(a2.getVlasnik());

        System.out.println("Auto 1 je u "+a1.getStepenPrenosa()+". stepenu prenosa.");
        System.out.println("Menjamo brzinu na vise ...");
        int trenutniStepen = a1.getStepenPrenosa();
        a1.setStepenPrenosa(trenutniStepen+1);
        System.out.println("Auto 1 je sad u "+a1.getStepenPrenosa()+". stepenu prenosa");
    }


}
