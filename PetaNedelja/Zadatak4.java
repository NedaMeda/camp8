import java.util.Scanner;

public class Zadatak4 {


    public static void main(String[] args) {

        //4.
        //Napisati program koji učita dva niza i kao rezultat kreira treći niz koji predstavlja presek učitanih nizova.
        //Ispisati rezultat u formatu ‘( element * element * element * … element).’

        System.out.println("Unesite broj elemenata nizova:");
        Scanner sc=new Scanner(System.in);
        int brojElemenata = sc.nextInt();
        int brojac=0;
        String[] niz=new String[brojElemenata];
        String[] niz2=new String[brojElemenata];
        String[] niz3=new String[brojElemenata];

        for (int i=0; i<brojElemenata; i++){
            System.out.println("Unesite element "+(i+1)+" za niz 1");
            niz[i] = sc.next();
        }
        System.out.println("Niz 1 zavrsen");

        for (int k=0; k<brojElemenata; k++){
            System.out.println("Unesite element "+(k+1)+" za niz 2");
            niz2[k] = sc.next();

            for (int x=0; x<niz.length; x++){

                if (niz2[k].equals(niz[x])){
                    niz3[brojac++]=niz2[k];
                }
            }
        }

        System.out.print("Niz 1: ");
        for(int z=0; z<niz.length; z++) {
            System.out.print(niz[z]+" ");
        }
        System.out.println("\n");
        System.out.print("Niz 2: ");
        for(int z=0; z<niz.length; z++) {
            System.out.print(niz2[z]+" ");
        }
        System.out.println("\n");
        System.out.print("Niz 3: ");
        for(int z=0; z<niz.length; z++) {
            if (niz3[z]!=null)
            {
                System.out.print(niz3[z]+" ");
            }
        }



    }
}
