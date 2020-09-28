import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        //Napisati program koji od korisnika traži da unese neki datum i da ispiše koji je to po redu dan u godini.
        // Za izračunavanje definisati i koristiti niz.

        Scanner sc=new Scanner(System.in);

        int unetiDan=0;
        int unetiMesec=0;
        int danUGodini=0;
        int[]meseci={31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Unesite dan");
        unetiDan= sc.nextInt();
        System.out.println("Unesite broj meseca");
        unetiMesec= sc.nextInt();

for(int i=0; i<unetiMesec-1; i++){
    danUGodini=danUGodini+meseci[i];
}
danUGodini=danUGodini+unetiDan;
        System.out.println("Izabrani dan u godini je "+danUGodini);


    }
}
