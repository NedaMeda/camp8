import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //Zadatak 2:
        //- U trci učestvuje 4 trkača.
        // Posmatrajmo trenutak u kome najsporiji zaostaje 6 krugova do kraja trke, dva srednja 5 krugova i najbrži samo 4 kruga.
        //        -Svaki put kad obrnu krug, program treba da ispiše koliko je krugova ostalo kom atletičaru do cilja.
        //         Program dobija informaciju o tome koji je igrač istrčao krug tako što se unosi njegov redni broj.
        //        -Program se završava kada svi trkači završe trku.
        //      Bonus: Ispisati rang listu trkača.

        int trkac1=6;
        int trkac2=5;
        int trkac3=5;
        int trkac4=4;
        int redniBroj=0;

        Scanner sc=new Scanner(System.in);

        while(true){

            System.out.println("Unesite broj trkaca od 1 do 4");
            redniBroj= sc.nextInt(); //uneseni broj trkaca koji je obisao krug

            switch(redniBroj){
                case 1:
                    if(trkac1!=0){    //provera da li je trkac stigao do poslednjeg kruga
                        trkac1--;     // ako nije, smanjuje se broj krugova koji mu je preostao
                    }
                    else {
                        System.out.println("Trkac broj 1 je vec na cilju");
                    }
                    break;
                case 2:
                    if(trkac2!=0){
                        trkac2--;
                    }
                    else {
                        System.out.println("Trkac broj 2 je vec na cilju");
                    }
                    break;
                case 3:
                    if(trkac3!=0){
                        trkac3--;
                    }
                    else {
                        System.out.println("Trkac broj 3 je vec na cilju");
                    }
                    break;
                case 4:
                    if(trkac4!=0){
                        trkac4--;
                    }
                    else {
                        System.out.println("Trkac broj 4 je vec na cilju");
                    }
                    break;


                default:                //ako je uneto nesto sto nije uneseni dobar broj trkaca
                    System.out.println("Uneli ste nepostojeci broj trkaca. Pokusajte ponovo.");

            }
            System.out.println("Trkacu broj 1 je ostalo "+trkac1+" krugova");
            System.out.println("Trkacu broj 2 je ostalo "+trkac2+" krugova");
            System.out.println("Trkacu broj 3 je ostalo "+trkac3+" krugova");
            System.out.println("Trkacu broj 4 je ostalo "+trkac4+" krugova");

            if(trkac1==0 && trkac2==0 && trkac3==0 && trkac4==0){   //slucaj kad su svi trkaci stigli do kraja
                System.out.println("Trka je zavrsena.");
                              }



        }
    }
}
