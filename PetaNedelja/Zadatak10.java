import java.util.Scanner;

public class Zadatak10 {

    //10.
    //Za zadati niz String-ova ispisati da li niz sadrži iste Stringove dva ili više puta.

    public static void main(String[] args) {
        System.out.println("Unesite broj stingova:");
        Scanner sc=new Scanner(System.in);
        int brojStringova = sc.nextInt();
        String[] niz=new String[brojStringova];

        for (int i=0; i<brojStringova; i++){
            System.out.println("Unesite string "+(i+1));
            niz[i] = sc.next();

        }

        int brojac=0;
        for (int i=0; i<niz.length; i++){

            for (int x=i+1; x<niz.length; x++){

                if (niz[i].equals(niz[x])){
                    brojac++;
                    break;
                }

            }

        }


        if (brojac>0){
            System.out.print("Neki stringovi se ponavljaju");
        }
        else{
            System.out.println("Svi stringovi su unikatni");
        }


    }
}
