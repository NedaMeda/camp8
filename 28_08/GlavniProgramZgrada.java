import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class GlavniProgramZgrada {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Uneti broj stanova (minimum 5):");
        int brojStanovaUZgradi = sc.nextInt();
        String[]spisakStanara=new String[brojStanovaUZgradi];
        napraviSpisak(spisakStanara,brojStanovaUZgradi);
        System.out.println(Arrays.toString(spisakStanara));


        Zgrada zg1=new Zgrada(brojStanovaUZgradi, spisakStanara);
        zg1.setAdresa("Beogradska 5");
        System.out.println(zg1.getAdresa());

        zg1.setSprat(3);
        System.out.println("Zgrada ima "+ zg1.getSprat() +" spratova.");

        zg1.setBrStanova(5);
        brojStanovaUZgradi = zg1.getBrStanova();
        System.out.println("Broj stanova u zgradi je: "+brojStanovaUZgradi);

        zg1.popuniStanare(spisakStanara, brojStanovaUZgradi);
        System.out.println("Stanar u stanu 4 se preziva: "+ zg1.getPrezime(4));
        System.out.println("Zivkvic se useljava u stan 4 umesto "+ zg1.getPrezime(4));
        zg1.setPrezime("Zivkovic",4);
        System.out.println("Novi stanar u stanu 4 se preziva: "+ zg1.getPrezime(4));

    }
    public static void napraviSpisak(String[]spisakStanara, int brStanova){
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<brStanova; i++){
            System.out.println("Unesite prezime stanara:");
            spisakStanara[i]=sc.next();
        }
    }
}
