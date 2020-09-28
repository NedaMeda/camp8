import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        int broj = 0;
        System.out.println("Unesite broj: ");
        Scanner sc = new Scanner(System.in);

        broj = sc.nextInt();

        switch (broj) {
            case 5:
                System.out.println("Vas broj pet se sastoji od tri slova");
                break;
            case 23:
                System.out.println("Vas broj dvadesettri se sastoji od jedanaest slova");
                break;
            case 98:
                System.out.println("Vas broj devedesetosam se sastoji od trinaest slova");
                break;
            case 144:
                System.out.println("Vas broj stocetrdesetcetiri se sastoji od osamnaest slova");
                break;
            case 1007:
                System.out.println("Vas broj hiljadusedam se sastoji od dvanaest slova");
                break;
            default:
                System.out.println("Proverite da li ste uneli dobro podatke");
                break;
        }

    }
}