import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        //3.
        //Za zadati ceo broj odrediti da li je on stepen broja 3.

        Scanner sc = new Scanner(System.in);
        int cifra = 0;
        int deljivoSa3 = 0;
        int broj = 0;
        System.out.println("Unesite Vas broj");
        cifra = sc.nextInt();

        while (cifra % 3 == 0) {

            cifra = cifra / 3;

        }
        if (cifra == 1) {
            System.out.println("Broj je stepen broja 3");

        }
        else
        {
            System.out.println("Broj nije stepen broja 3");

        }
    }
}
