import java.util.ArrayList;

public class PlanDrustvo {

    //Planinarsko drustvo poseduje naziv, i spisak planinara. Spisak planinara je inicijalno prazan i planinar moze da se doda ili
    //ukloni sa spiska. Ove akcije ralizovati kao 2 zasebne metode(dodaj, ukloni). Naziv se zadaje prilikom kreiranja i moguce ga i
    //dohvatiti i postaviti. Moze da se dohvati broj planinara registrovanih u drustvu. Planinarsko drustvo je zaduzeno za kreiranje
    //planinara, to jest, poseduje metodu registruj(Osoba o, String brojDozvole), koja osobu o registruje kao planinara u svom
    //drustvu, sa brojemDozvole brojDozvole. Novoregistrovanog planinara dodaje u spisak planinara i vraca referncu na tog
    //planinara. Primer poziva metode registruj:
    //Osoba o1 = new Osoba("Petar","Petrovic",1992,"1234567890123");
    //Planinar p1=drustvo1.registruj(o1,"1234567");
    //Planinarsko drustvo moze se ispisati na sledeci nacin:
    //
    //[NazivDrustva]{BrojPlaninara}
    //Planinar1
    //Planinar2
    //...
    //
    //Gde su planinar1, planinar2 itd, planinari registrovani u planinarskom drustvu.

    private String imePlaninDrust;
    private static ArrayList<Planinar> spisak = new ArrayList<>();

    public PlanDrustvo(String imePlaninDrust) {
        this.imePlaninDrust = imePlaninDrust;
    }

    public void setImePlaninDrust(String imePlaninDrust) {
        this.imePlaninDrust = imePlaninDrust;
    }

    public String getImePlaninDrust() {
        return imePlaninDrust;
    }

    public static int getBrojPlaninara(){

        return spisak.size();
    }

    public static void addPlaninar(Planinar planinar){
        spisak.add (planinar);
    }

    public static void removePlaninar(int index) {
        if (index < 0 && index>(spisak.size()) - 1){
            System.out.println("Index je van spiska, pokusajte ponovo.");
        }
        else{
            spisak.remove(index);
        }

    }
    public static Planinar registruj(Osoba o, String brojPlaninDozvl){
        Planinar p1= (Planinar) Planinar.kreiraj(o, brojPlaninDozvl);
        addPlaninar(p1);
        return p1;
    }
    //[NazivDrustva]{BrojPlaninara}
    @Override
    public String toString() {
    String ispis = "\n";
        for(int i=0; i<spisak.size();i++){
        ispis=ispis.concat(spisak.get(i).toString()+"\n");
    }

        return "[" + imePlaninDrust + "]{" + getBrojPlaninara() + "}" + ispis;


    }

}
