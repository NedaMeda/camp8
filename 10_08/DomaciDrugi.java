import java.util.Scanner;

public class DomaciDrugi {
    public static void main(String[]args){

        //Napisati program koji unosi i sabrira dva broja
        // dokle god je zbir brojeva ide do broja 10 (ukljucujuci i 10)
        // a mnozi dokle god je proizvod veci od (predhodno) maksimalnog zbira brojeva do broja n.


        int broj1=0;
        int broj2=0;
        int proizvod=0;
        System.out.println("Unesite 2 broja: ");


        Scanner sc = new Scanner(System.in);


        broj1 =sc.nextInt();
        broj2 = sc.nextInt();

        int zbir=broj1+broj2;
        if (zbir <=10){
            System.out.println("Zbir brojeva je :" +zbir);

        }


        else{
            proizvod=broj1*broj2;
            System.out.println("Proizvod brojeva je :" +proizvod);
        }

    }
}
