import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        //Zadatak 1:
        //-Napisati program koji učitava jedan broj koji predstavlja koliko ljudi
        // će nakon toga uneti podatke o broju dece koju imaju.
        //-Nakon što se broj ljudi učita, učitavaju se podaci o broju dece.
        //-Nakon toga, ispisati koji procenat ljudi ima više od dvoje dece.
        //
        //Na primer, ukoliko se unese broj 4, a zatim brojevi 1, 3, 2 i 4 program treba da ispiše poruku da 50% ljudi
        // ima preko dvoje dece.

        Scanner sc=new Scanner(System.in);
        float brojLjudi=0; //koliko ce ucestvovati u anketi
        int brojDece=0;  //koliko ucesnik ima dece
        float viseOdDvojeDece=0; //broj ljudi sa vise od dvoje dece

        System.out.print("Unesite broj ljudi u anketi:");

        brojLjudi=sc.nextInt(); //unos broja ljudi koji ucestvuje u anketi

        for(int i=1; i<=brojLjudi; i++){
            System.out.println("Unesite broj dece");
            brojDece= sc.nextInt(); //broj dece koji je uneo ucesnik

            if(brojDece>2){
                viseOdDvojeDece++;  //ako je broj dece veci od 2 dodaje u grupu ljudi sa vise od dvoje dece
            }
        }

        System.out.println("Ukupan broj ljudi " +brojLjudi);
        System.out.println("Broj ljudi sa vise od dvoje dece " +viseOdDvojeDece);

        float procenatLjudi=(viseOdDvojeDece/brojLjudi)*100; // zbog procenta ubacen float
        System.out.println("Procenat ljudi sa vise od dvoje dece je "+procenatLjudi);
    }
}
