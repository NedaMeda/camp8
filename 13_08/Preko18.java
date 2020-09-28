import java.util.Scanner;

public class Preko18 {
    public static void main(String[] args) {
        //Napraviti program koji upisuje broj godina nekih osoba a posle 10 unosa,
        // program treba da izbaci koliko osoba ima od 18 do 50 godina a koliko ima mladjih od 18.

        Scanner sc=new Scanner(System.in);
        int god=0;
        int mladjiOd18=0;
        int od18Do50=0;

        for(int i=0; i<10; i++){
            System.out.println("Unesite broj godina");
            god= sc.nextInt();

            if(god<18 && god>=1){
                mladjiOd18++;
            }
            else if(god >=18 && god <=50){
                od18Do50++;
            }

                        }
        System.out.println("Mladjih od 18 god ima "+mladjiOd18);
        System.out.println("Od 18 do 50 god ima "+od18Do50);
        }
    }

