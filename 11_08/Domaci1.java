import java.util.Scanner;

public class Domaci1 {
    public static void main(String[] args) {

        //Napisati program koji od korisnika trazi da unese cetiri cela broja od 0 do n
        // a zatim da prva dva broja pomnozi a treci i cetvrti sabere.
        // Rezultat oba racunanja treba da se ispisuje zajedno sa informacijom
        // da li je rezultat tih racunanja paran ili neparan broj.

        System.out.println("Unesite 4 cela broja:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int suma = 0;
        int proizvod = 0;

        if (a < 0 || b < 0 || c < 0 || d < 0) {
            System.out.println("Proverite da li ste uneli pravilno podatke");
        }

        else {

            proizvod = a * b;
            suma = c + d;


            if (proizvod % 2 == 0) {
                System.out.println("Proizvod Vasa prva dva broja je " + proizvod + " i on je paran broj");
            } else {
                System.out.println("Proizvod Vasa prva dva broja je " + proizvod + " i on je neparan broj");
            }
            if (suma % 2 == 0) {
                System.out.println("Zbir Vasa druga dva broja je " + suma + " i on je paran broj");
            } else {
                System.out.println("Zbir Vasa druga dva broja je " + suma + " i on je neparan broj");
            }
        }
    }
}
