import java.util.Scanner;

public class Zadatak1A {
    public static void main(String[] args) {
        //1.
        //A) Učitati jedan broj i ispisati koliko on sadrži cifara koje su deljive sa 3.

        //B) Modifikovati program tako da se postupak pod A) ponavlja i to tako da pre svakog unosa korisnik vidi
        //pitanje da li želi da unese još jedan broj. Ako je odgovor 'da' treba izbrojati cifre deljive sa 3,
        // a ukoliko je 'ne' treba završiti program.

        //C) Omogućiti da unos reči 'da' i 'ne' ne bude caseSensitive.


        Scanner sc = new Scanner(System.in);
        int cifra = 0;
        int deljivoSa3 = 0;

        System.out.println("Unesite Vas broj");
        int broj = sc.nextInt();

        while (broj > 0) {
            cifra=broj % 10;
            if (cifra % 3 == 0) {
                deljivoSa3++;

            }
            broj = broj / 10;
        }
        System.out.println("Broj cifara deljivih sa 3 je "+deljivoSa3);
    }
}
