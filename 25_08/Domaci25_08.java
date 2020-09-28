import java.util.Scanner;

public class Domaci25_08 {

    public static void main(String[] args) {
        //Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:
        //
        //0 - Izlaz iz programa
        //1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
        //2 - naplata racuna
        //
        //Ukoliko korisnik unese opciju 0 program se zavrsava.
        //Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
        //Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
        //Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska,
        //bez umanjenja racuna i da se ponovo ispise meni.
        //Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
        //Zatim se ponovo ispisuje meni.


        Scanner sc = new Scanner(System.in);
        int stanjeRacuna = 0;

        while (true){
            System.out.println("Trenutno stanje racuna:" +stanjeRacuna);
        System.out.println("Unesite Vasu opciju: 0 (izlaz iz kupovine), 1 (ubacivanje u korpu), 2 (naplata racuna)");
        int izborKupca = sc.nextInt();
        switch (izborKupca){
            case 0:
                opcija0();
                break;
            case 1:
                stanjeRacuna = opcija1(stanjeRacuna);
                break;
            case 2:
                stanjeRacuna = opcija2(stanjeRacuna);
                break;
            default:
                System.out.println("Izabrana opcija nije validna. Probajte ponovo.");
        }



        }
    }



    public static void opcija0(){
            System.out.println("Vasa kupovina je zavrsena, zelimo Vam ugodan dan");
    System.exit(1);
    }

    public static int opcija1(int stanjeRacuna){
        System.out.println("Unesite cenu proizvoda:");
        Scanner sc = new Scanner(System.in);

        int cena = sc.nextInt();
        stanjeRacuna=stanjeRacuna+cena;
                System.out.println("Vas racun je "+stanjeRacuna);
                return stanjeRacuna;
            }


    public static int opcija2(int stanjeRacuna){
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite iznos za naplatu");
        int iznosZaNaplatu= sc.nextInt();
            if(iznosZaNaplatu<stanjeRacuna){
                System.out.println("Greska. Proverite da li ste uneli dobar iznos za naplatu.");
             return stanjeRacuna;
            }
            else if(iznosZaNaplatu>stanjeRacuna){
                int kusur = iznosZaNaplatu-stanjeRacuna;
                System.out.println("Ukupno racun: "+stanjeRacuna + " Kusur: "+kusur);
                return 0;
            }

        else{
            System.out.println("Iznos odgovara racunu. Nema kusura.");
            return 0;
            }

    }


    }

