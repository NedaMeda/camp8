import java.util.Scanner;

public class Fakultet {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] ispiti=new int[5];
        int brIndexa=0;
        int rezIspita=0;
        Studenti st1=new Studenti("Pera Petrovic", 12345, "Filozofija", ispiti);

        st1.setIspiti();

        while(true){
            System.out.println("Unesite broj indexa (0 za izlaz): ");
            brIndexa=sc.nextInt();
            if(brIndexa==st1.getBrIndexa()){
                System.out.println(st1.toString());
                //System.out.println("Ime i Prezime: "+st1.getImePrezime()+" Br.Indexa: "+st1.getBrIndexa()+" Smer: "+st1.getSmer()+ " Rezultati Ispita: "+st1.getIspiti().toString());
            }
            else if(brIndexa<0){
                System.out.println("Uneli ste negativan broj. Probajte ponovo.");
            }
            else if(brIndexa>0 && brIndexa!= st1.getBrIndexa()){
                System.out.println("Student sa takvim brojem ne postoji. Probajte ponovo.");
            }
            else break;
        }



    }
}
