import java.io.*;
import java.util.*;

public class Zadatak {
    public static void main(String[]ulaznipodaci)throws FileNotFoundException{

        int i = 0;
        int brojac=0;
        int brojStampa=0;
        String imefajla;
        Scanner in;

        if(ulaznipodaci.length !=1){
            System.exit(1);
        }

imefajla=ulaznipodaci[0];
        in=new Scanner(new File(imefajla));
        brojac=Integer.parseInt(in.nextLine());
        for(i=0;i<brojac;i++){
            brojStampa=Integer.parseInt(in.nextLine());
        if(brojStampa % 2==0){

            System.out.println(brojStampa);
        }
        }


    }

}


