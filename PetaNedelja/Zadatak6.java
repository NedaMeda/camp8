public class Zadatak6 {
    public static void main(String[] args) {

        //6.
        //Zadati su jedan niz celih brojeva, i jedan broj koji prestavlja ‘metu’.
        //Napisati program koji vraća indekse dva broja
        //koja kada se saberu daju rezultat jednak unetoj ‘meti’.
        //Pretpostaviti da će svaki ulazni podaci imati tačno jedno rešenje. Ne koristiti jedan element više puta.

        int[] niz={3,2,4,5,6,7,1,9,0};
        int meta=9;

        for (int i=0; i<niz.length; i++){

            for (int x=0; x<niz.length; x++){

                if (niz[i] + niz[x] == meta) {
                    if (i!=x) {
                        System.out.println("indeksi " + i + " (" + niz[i] + ")" + " i " + x + " (" + niz[x] + ")" + " daju zbirno metu br." + meta);
                    }
                }
            }

        }



    }
}