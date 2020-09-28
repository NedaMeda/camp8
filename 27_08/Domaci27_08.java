import java.util.Scanner;

public class Domaci27_08 {
    public static void main(String[] args) {

        //Napisati program koji će za uneti niz proveravati da li rastući ili nije rastući.
        //Kao dodatak zadatku, proveriti da li je niz rastući, opadajući ili ništa od toga.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj elemenata Vaseg niza");

        int brojElemenataNiza = sc.nextInt();
        int[] vasNiz = new int[brojElemenataNiza];

        for (int i = 0; i < brojElemenataNiza; i++) {
            System.out.println("Unesite Vas broj");

            int brojizNiza = sc.nextInt();
            vasNiz[i] = brojizNiza;
        }
        if(metodaProveriUzlaz(vasNiz)){
            System.out.println("Niz je uzlazan");
        }
        else if (metodaProveriNizlaz(vasNiz)){
            System.out.println("Niz je nizlazan");
        }
        else{
            System.out.println("Niz nije ni uzlazan ni nizlazan");
        }
    }

    public static boolean metodaProveriUzlaz(int[] vasNiz) {
        for (int i = 1; i < vasNiz.length; i++) {
            if (vasNiz[i-1] > vasNiz[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean metodaProveriNizlaz(int[] vasNiz){
        for (int i=1; i<vasNiz.length; i++){
            if(vasNiz[i-1] <vasNiz[i]){
                    return false;
            }
        }
        return true;
    }
}
