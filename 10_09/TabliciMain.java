import java.util.ArrayList;

public class TabliciMain {
    public static void main(String[] args) {
        ArrayList<String> karteIgrac1=new ArrayList<String>();
        ArrayList<String> karteIgrac2=new ArrayList<String>();

        Tablici t1=new Tablici();
        System.out.println("Igrac 1 na potezu");
        karteIgrac1 = t1.ucitavanjeKarata(karteIgrac1);
        System.out.println(karteIgrac1);
        System.out.println("Igrac 2 na potezu");
        karteIgrac2 = t1.ucitavanjeKarata(karteIgrac2);
        System.out.println(karteIgrac2);
        t1.koJePobednik(karteIgrac1,karteIgrac2);
    }
}
