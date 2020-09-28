public class Zadatak9A {

    public static void main(String[] args) {

        //9.
        //A) Zadat je niz brojeva. Napisati program koji pomera sve nule na kraj niza, zadržavajući redosled nenultih
        //elemenata.

        int[] niz={0,1,2,3,0,5,0,9};
        int[] niz2=new int[8];
        int brojNula=0;



        for (int i=0; i<niz.length; i++){
            if (niz[i]!=0){
                niz2[brojNula++]=niz[i];
            }

        }
        while (brojNula<niz.length){
            niz2[brojNula++]=0;
        }
        System.out.print("Prepravljeni niz je: ");
        for(int z=0; z<niz.length; z++) {
            System.out.print(niz2[z]+" ");
        }
    }
}
