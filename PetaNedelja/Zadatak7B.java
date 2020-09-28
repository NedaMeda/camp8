import java.util.Scanner;

public class Zadatak7B {
        //7.
        //Teža varijanta: Zadatak odraditi tako da se ne alocira dodatni prostor, već modifikuje ulazni niz.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Unesite duzinu niza");
        int duzinaNiza = sc.nextInt();

        String[] niz=new String[duzinaNiza];

        for (int i = niz.length; i > 0; i--)
        {
            System.out.println("Unesite karakter");
            niz[i-1] = sc.next();
        }

        System.out.print("Obrnuti niz je: ");
        for (int i=0; i<niz.length; i++)
        {
            System.out.print(niz[i]);
        }


    }
}
