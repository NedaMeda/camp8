import java.util.Scanner;

public class Zadatak8A {
    //8.
    //A) Napisati program koji za uneti broj telefona (u vidu String-a) ispisuje informaciju o tome da li je broj
    //napisan u odgovarajućem formatu. Pretpostaviti da se validan telefonski broj može pojaviti u jednom od
    //sledećih formata:
    //(xxx) xxx-xxxx ili xxx-xxx-xxxx gde 'x' predstavlja jednu cifru.

    public static void main(String[] args) {
        System.out.println("Unesite broj telefona u formatu (xxx)xxx-xxxx ili xxx-xxx-xxxx:");
        Scanner sc=new Scanner(System.in);
        String telBroj = sc.nextLine();

        char zagrada1=telBroj.charAt(0);
        char zagrada2=telBroj.charAt(4);
        char crtica1=telBroj.charAt(8);

        char crtica2=telBroj.charAt(3);
        char crtica3=telBroj.charAt(7);

        int duzina=telBroj.length();

        char cifra;


        if (Character.compare(zagrada1, '(')==0){ // da li broj pocinje zagradom ili brojem ... ako je zagrada format je (xxx)xxx-xxxx
            char[] nizBrojeva= {telBroj.charAt(1),telBroj.charAt(2),telBroj.charAt(3),telBroj.charAt(5),telBroj.charAt(6),
                    telBroj.charAt(7),telBroj.charAt(9),telBroj.charAt(10),telBroj.charAt(11),telBroj.charAt(12)};

            for (int i=0; i<nizBrojeva.length; i++){ //provera cifara
                cifra = nizBrojeva[i];
                if (cifra >= '0' && cifra <= '9'){
                }
                else{ //znak ili slovo umesto cifre
                    System.out.println("Broj moze sadrzati samo cifre");
                    System.exit(1);
                }
            }
        }

        else { //broj pocinje cifrom te je format xxx-xxx-xxxx
            char[] nizBrojeva2= {telBroj.charAt(0),telBroj.charAt(1),telBroj.charAt(2),telBroj.charAt(4),telBroj.charAt(5),
                    telBroj.charAt(6),telBroj.charAt(8),telBroj.charAt(9),telBroj.charAt(10),telBroj.charAt(11)};

            for (int i=0; i<nizBrojeva2.length; i++){ //provera cifara
                cifra = nizBrojeva2[i];
                if (cifra >= '0' && cifra <= '9'){
                }
                else{
                    System.out.println("Broj 2 moze sadrzati samo cifre");
                    System.exit(1);
                }
            }
        }


        //provera da li su sve zagrade i crtice na mestu za format (xxx)xxx-xxxx

        if (Character.compare(zagrada1, '(')==0 && Character.compare(zagrada2, ')')==0 && Character.compare(crtica1, '-')==0 && duzina==13) {
            System.out.println("Broj "+telBroj+ " je ispravan u fromatu (xxx)xxx-xxxx");
        }

        //provera da li su sve zagrade i crtice na mestu za format xxx-xxx-xxxx
        else if(Character.compare(crtica2, '-')==0 && Character.compare(crtica3, '-')==0 && duzina==12){
            System.out.println("Broj "+telBroj+ " je ispravan u fromatu xxx-xxx-xxxx");
        }
        //format nije ispravan
        else{
            System.out.println("Broj nije u fromatu (xxx)xxx-xxxx ili xxx-xxx-xxxx");
        }


    }
}
