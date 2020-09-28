import java.util.Scanner;

public class Loptice {
    public static void main(String[] args) {

        //Napisati program koji ubacuje unetu kolicinu lopti u korpu za kupovinu.
        // Prilikom unosa broja lopti, u korpu se mora ubaciti minimum jedna lopta
        // a maksimalan broj lopti koji moze da stane u korpu je 33.

        System.out.println("Unesite zeljeni broj lopti za korpu");
        Scanner sc = new Scanner(System.in);
        int brojLopti = 0;
        int sumaLopti = 0;


        while (true) {

            brojLopti = sc.nextInt();

            if (brojLopti <= 0) {
                System.out.println("Minimalan broj lopti za korpu je 1. Ponovite unos.");
            }
            if(sumaLopti+brojLopti==33){
                System.out.println("Vasa korpa je puna.");
                break;
            }
            if (sumaLopti + brojLopti < 33) {

                sumaLopti = sumaLopti + brojLopti;
                System.out.println("Broj lopti u korpi je "+sumaLopti);
            }

            else{
                System.out.println("Maksimalan broj lopti za korpu je 33. Ponovite unos.");

            }

        }
    }
}
