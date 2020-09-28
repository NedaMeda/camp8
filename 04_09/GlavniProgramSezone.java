import java.util.ArrayList;

public class GlavniProgramSezone {
    public static void main(String[] args) {
        Pozoriste p1=new Pozoriste("Pozoristance Puz");
        System.out.println(p1.toString());
        Pozoriste p2=new Pozoriste("Pozoriste lutaka");
        System.out.println(p2.toString());

        Zaposleni z1=new Zaposleni("Branko Kockica",p1);
        System.out.println(z1.toString());

        Zaposleni z2=new Zaposleni("Janko Loptica",p2);
        System.out.println(z2.toString());

        Zaposleni z3=new Zaposleni("Ivanko Trouglic",p2);
        System.out.println(z3.toString());

        Glumac g1=new Glumac("Puzic Puz",p1,"Tata Puz Sporac");
        System.out.println(g1.toString());

        Reditelj r1=new Reditelj("Albert Hickup",p2,"Stucko");
        System.out.println(r1.toString());

        ArrayList<Zaposleni> lista=new ArrayList<>();
        lista.add(z2);
        lista.add(z3);

        Predstava pr1 = new Predstava("Letece lutke",p2,lista);
        System.out.println(pr1.toString());
    }


}
