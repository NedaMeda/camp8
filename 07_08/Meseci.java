import java.io.*;
import java.util.*;

public class Meseci {
    public static void main (String[]args) {

        System.out.println("Unesite imena 3 meseca: ");

        Scanner sc = new Scanner(System.in);
        String mesec;

        int zbirDanaMeseci = 0;
        int brojac = 3;

        while (brojac >0) {

            mesec = sc.next();


            switch (mesec) {
                case "januar":
                    System.out.println("31");
                    zbirDanaMeseci=zbirDanaMeseci+31;
                    break;
                case "februar":
                    System.out.println("28");
                    zbirDanaMeseci=zbirDanaMeseci+28;
                    break;
                case "mart":
                    System.out.println("31");
                    zbirDanaMeseci=zbirDanaMeseci+31;
                    break;
                case "april":
                    System.out.println("30");
                    zbirDanaMeseci=zbirDanaMeseci+30;
                    break;
                case "maj":
                    System.out.println("31");
                    zbirDanaMeseci=zbirDanaMeseci+31;
                    break;
                case "juni":
                    System.out.println("30");
                    zbirDanaMeseci=zbirDanaMeseci+30;
                    break;
                case "jul":
                    System.out.println("31");
                    zbirDanaMeseci=zbirDanaMeseci+31;
                    break;
                case "avgust":
                    System.out.println("31");
                    zbirDanaMeseci=zbirDanaMeseci+31;
                    break;
                case "septembar":
                    System.out.println("30");
                    zbirDanaMeseci=zbirDanaMeseci+30;
                    break;
                case "oktobar":
                    System.out.println("31");
                    zbirDanaMeseci=zbirDanaMeseci+31;
                    break;
                case "novembar":
                    System.out.println("30");
                    zbirDanaMeseci=zbirDanaMeseci+30;
                    break;
                case "decembar":
                    System.out.println("31");
                    zbirDanaMeseci=zbirDanaMeseci+31;
                    break;

                default:
                    System.out.println("Proverite da li ste uneli dobro podatke");
                    break;
            }
            brojac--;
        }
        System.out.println("Zbir dana u Vasim mesecima je " + zbirDanaMeseci);
    }
}
