import java.util.Scanner;

public class Domaci1008 {
    public static void main(String[]args){

        //Napisati program koji ce uneseni broj u opsegu od 0 do n deliti sa 2 i 3.
        // Ukoliko je ceo broj, treba da izbaci rezultat a ukoliko ne treba da ispise odgovarajucu poruku.


        System.out.println("Unesite Vas broj: ");

        int d;
        Scanner sc=new Scanner(System.in);
        d=sc.nextInt();

        if (d%2==0){
            System.out.println("Rezultat deljenja Vaseg broja sa 2 je "+d/2);
        }
        else {
            System.out.println("Vas broj deljenjem sa 2 ne daje ceo broj");
        }
        if (d%3==0){
            System.out.println("Rezultat deljenja Vaseg broja sa 3 je "+d/3);
        }

        else if(d%2!=0){
            System.out.println("Vas broj deljenjem sa 2 ne daje ceo broj");
        }
        else {
            System.out.println("Vas broj deljenjem sa 3 ne daje ceo broj");
        }

    }
}
