public class Zadatak9B {

    public static void main(String[] args) {

        //9.
        //A) Zadat je niz brojeva. Napisati program koji pomera sve nule na kraj niza, zadržavajući redosled nenultih
        //elemenata.
        //B) Zadatak odraditi tako da se ne alocira dodatni prostor za novi niz, već modifikovati postojeći.

        int[] niz={0,1,2,3,0,5,0,9};
        int brojNula=0;



        for (int i=0; i<niz.length; i++){
            if (niz[i]!=0){
                niz[brojNula++]=niz[i];
            }

        }
        while (brojNula<niz.length){
            niz[brojNula++]=0;
        }
        System.out.print("Prepravljeni niz je: ");
        for(int z=0; z<niz.length; z++) {
            System.out.print(niz[z]+" ");
        }
    }
}