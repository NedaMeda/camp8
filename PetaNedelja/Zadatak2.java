import java.util.Scanner;

public class Zadatak2 {
    //2.
    //Zadat je nenegativan broj. Sabirati njegove cifre sve dok rezultat ne bude samo jedna cifra. Ispisati je.

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        long broj=0;
        long cifraA=0;

        System.out.println("Unesite broj");
        broj = sc.nextLong();
        long unetiBroj = broj;
        long zbirCifara = 0;

        if (broj > 0){

            do {

                while (unetiBroj != 0) {

                    cifraA = unetiBroj % 10;
                    zbirCifara = zbirCifara + cifraA;
                    unetiBroj = unetiBroj / 10;
                }
                unetiBroj = zbirCifara;
                System.out.println("Medjuzbir: "+unetiBroj);
                zbirCifara = 0;

            }while(unetiBroj/10!=0);

            System.out.println("Rezultat je:"+unetiBroj);
        }

        else{
            System.out.println("Broj nije pozitivan.");
        }
    }
}