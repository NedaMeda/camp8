import java.util.Scanner;

public class Zadatak7A {
        //7.
        //Lakša varijanta: Napisati program koji vraća niz karaktera u obrnutom redosledu. Ulaz je niz char-ova.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite duzinu niza");
        int duzinaNiza = sc.nextInt();

        String[] niz=new String[duzinaNiza];

        for (int i = 0; i < niz.length; i++)
        {
            System.out.println("Unesite karakter");
            niz[i] = sc.next();
        }
        System.out.print("Obrnuti niz je: ");
        for (int i=duzinaNiza; i>0; i--)
        {
            System.out.print(niz[i-1]);
        }


    }
}
