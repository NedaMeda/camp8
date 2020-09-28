import java.util.ArrayList;
import java.util.Scanner;

public class Tablici {
    private ArrayList<String> karteIgraca = new ArrayList<String>();



    public ArrayList<String> ucitavanjeKarata(ArrayList<String> karteI){
     //   ArrayList<String> karte = new ArrayList<String>();

        int brojKarata = 0;
        String unetaKarta;
        do {
            System.out.println("Unesite broj karata:");
            Scanner sc = new Scanner(System.in);
            brojKarata = sc.nextInt();
            if (brojKarata > 0 && brojKarata < 52) {
                for (int i = 0; i < brojKarata; i++) {
                    System.out.println("Unesite kartu "+ (i+1));
                    while (true) {

                    unetaKarta = sc.next();
                        if (unetaKarta.equals("2") || unetaKarta.equals("3") || unetaKarta.equals("4") || unetaKarta.equals("5") || unetaKarta.equals("6") || unetaKarta.equals("7") || unetaKarta.equals("8") || unetaKarta.equals("9") || unetaKarta.equals("10") || unetaKarta.equals("J") || unetaKarta.equals("Q") || unetaKarta.equals("K") || unetaKarta.equals("A")) {
                            karteI.add(unetaKarta);
                            break;
                        }
                        System.out.println("Nesto nije u redu sa kartom. Probajte ponovo.");
                    }
                    }
            break;
            } else {
                System.out.println("Nerealan broj karata. Probajte ponovo.");
            }
        }while (brojKarata>0 && brojKarata<52);

        return karteI;
    }

    public int zbirStihova(ArrayList<String> karte){

        int zbirKarata = 0;
        String trenutnaKarta;
        for (int i=0; i<karte.size(); i++){
            trenutnaKarta = karte.get(i);
            switch (trenutnaKarta){
                    case "A":
                        zbirKarata+=1;
                        break;
                    case "K":
                        zbirKarata+=1;
                        break;
                    case "Q":
                        zbirKarata+=1;
                        break;
                    case "J":
                        zbirKarata+=1;
                        break;
                    default:
                        break;

            }

        }
        return zbirKarata;
    }

    public void koJePobednik(ArrayList<String> karteIgraca1, ArrayList<String> karteIgraca2){
        int zbirIgrac1 = zbirStihova(karteIgraca1);
        System.out.println("igrac 1 ima " + zbirIgrac1 + " bodova na stihove.");
        int zbirIgrac2 = zbirStihova(karteIgraca2);
        System.out.println("igrac 2 ima " + zbirIgrac2 + " bodova na stihove.");

        if (triNaKarte(karteIgraca1, karteIgraca2)){
            zbirIgrac1+=3;
            System.out.println("igrac 1 ima 3 boda na karte.");
        }
        else {
            zbirIgrac2+=3;
            System.out.println("igrac 2 ima 3 boda na karte.");
        }
        if (zbirIgrac1>zbirIgrac2) {

            System.out.println("pobednik je igrac 1 sa ukupno " +zbirIgrac1+ " bodova.");
        }
        else{
            System.out.println("pobednik je igrac 2 sa ukupno " +zbirIgrac2+ " bodova.");

        }
    }

    public boolean triNaKarte(ArrayList<String> karteIgraca1, ArrayList<String> karteIgraca2){
        if (karteIgraca1.size() > karteIgraca2.size()){
            return true;
        }
        else {
            return false;
        }
    }


}


//Zadatak 1.
//Zadatak predstavlja jedan deo kartaške igre Tablić .
//- Napraviti metodu koja ce da u jedan niz ucita sve karte koje je jedan korisnik sakupio. Karte
//učitavati kao cele brojeve - kec je broj 11, žandar 12, dama 13 i kralj 14.
// Tražiti od korisnika da
//učita koliko karata ima, a nakon toga koje su to karte. Voditi računa o tome da li su broj karata,
//kao i svaka karta korektne vrednosti.


//- Napraviti metodu koja broji koliko ima štihova u nizu. Podrazumevati da mala dvojka i dupla
//desetka nemaju specijalno znacenje.
//- Napraviti metodu koja će za dva prosleđena niza vratiti informaciju o tome ko je pobednik (ko
//ima više sakupljenih štihova).
//- Napraviti glavni program koji prikazuje primenu svih prethodno napisanih metoda.