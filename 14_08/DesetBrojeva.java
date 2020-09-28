import java.util.Arrays;
import java.util.Scanner;

public class DesetBrojeva {
    public static void main(String[] args) {
        //Napisati program koji traži od korisnika da unese deset celih brojeva (brojevi trebaju da se učitavaju kao niz),
        // zatim da odstampa taj niz i njegov najveći član.
        //Kao deo za istrazivanje, u istom zadatku mozete uraditi sortiranje brojeva od najmanjeg do najveceg i tako sortirane ih istampate.
        Scanner sc=new Scanner(System.in);
        int[]niz=new int[10];
        System.out.println("Unesite 10 brojeva");

        for(int i=0; i<10; i++){
            niz[i]= sc.nextInt();
        }
        Arrays.sort(niz);
        System.out.println("Sortirani niz je");
        for(int n=0; n<10;n++){
            System.out.println(niz[n]);
        }
        System.out.println("Najveci broj je "+niz[9]);
    }

}
