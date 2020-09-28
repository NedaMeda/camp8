import java.util.Scanner;

public class ImeIGodine {
    public static void main(String[] args) {
        //Napraviti program u kom su upisani ime i godine nekoliko osoba (minimum 3).
        // Kada korisnik programa unosi imena osoba pri svakom unosu treba da izbaci njihove godine i poredja od najmladje do najstarije osobe.
    Scanner sc=new Scanner(System.in);
    String[] imena={"Jelena", "Milena", "Ivana", "Jovana", "Tijana"};
    String unetoIme;
    int [] godine={5, 10, 15, 20, 25};

    for(int i=0; i< imena.length; i++) {

        System.out.println("Unesite ime");
        unetoIme=sc.nextLine();

        for(int n=0; n< imena.length; n++){
            if (unetoIme.equals(imena[n])){
                System.out.println("Osoba ima "+ godine[n]+" godina");
            }
        }
        //nisam znala kako da poredjam godista

    }


    }
}
