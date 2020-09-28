public class GlavniProgram {
    public static void main(String[] args) {

        //U glavnom programu planinare kreirati iskljucivo preko metode registruj klase PlaninarskoDrustvo.
        //Kreiranje Planinara na drugi nacin je dozvoljeno radi testiranja samo i ukoliko klasa PlaninarskoDrustvo nije napisana.
        //Ukoliko je klasa PlaninarskoDrustvo napisana, kreiranje se vrsi iskljucivo preko metode registruj klase PlaninarskoDrustvo.
        //Za vodjenje spiska planinara u klasi PlaninarskoDrustvo dozvoljeno je koriscenje klase List.
        Osoba o1 = new Osoba("Mini","Maus",1953,"1234567890123");
        //Planinar p1 = Planinar.kreiraj(o1,"1234567");

        Osoba o2 = new Osoba("Patak", "Daca",1950,"2345678901234");
        Osoba o3 = new Osoba("Miki", "Maus", 1940, "3456789012345");
        Osoba o4 = new Osoba("Paja", "Patak", 1935, "4567890123456");

        Planinar p1=PlanDrustvo.registruj(o1,"1234567");
        Planinar p2=PlanDrustvo.registruj(o2,"2345678");
        Planinar p3=PlanDrustvo.registruj(o3,"3456789");
        Planinar p4=PlanDrustvo.registruj(o4,"4567890");


//        PlanDrustvo.removePlaninar(0);
//        System.out.println(PlanDrustvo.getBrojPlaninara());
        PlanDrustvo pd = new PlanDrustvo("Veseli penjaci");
        System.out.println(pd.toString());
    }
}
