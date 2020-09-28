import java.util.ArrayList;

public class Ocene {

    //Napraviti klasu Ocena.
    // Potrebno je da sadrzi broj poena koje je neko imao na ispitu i metodu koja vraca koja ocena je u pitanju.
    // Sadrzi naziv predmeta, i rok u kom je odrzan.
    // Klasa ocena treba da ima i metodu kojoj se prosledjuje niz ocena koja racuna i vraca prosek.
    // Prethodnu klasu testirati.

    private int brojPoena;
    private int ocena;
    private String nazivPredmeta;
    private String rokOdrzavanjaIspita;

    public Ocene(int brojPoena, int ocena, String nazivPredmeta, String rokOdrzavanjaIspita) {
        this.brojPoena = brojPoena;
        this.ocena = ocena;
        this.nazivPredmeta = nazivPredmeta;
        this.rokOdrzavanjaIspita = rokOdrzavanjaIspita;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
       if (brojPoena >=0 && brojPoena <=100){
        this.brojPoena = brojPoena;
       }
       else{
           System.out.println("Broj poena moze biti samo izmedju 0 i 100. 0 upisana");
           this.brojPoena = 0;
       }
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        if (ocena >10 && ocena <=0){
            System.out.println("Ocena moze biti samo izmedju 0 i 10. Upisana ocena 0");
            this.ocena = 0;
        }
        this.ocena = ocena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getRokOdrzavanjaIspita() {
        return rokOdrzavanjaIspita;
    }

    public void setRokOdrzavanjaIspita(String rokOdrzavanjaIspita) {
        this.rokOdrzavanjaIspita = rokOdrzavanjaIspita;
    }

    public int izracunajOcenu(){
        if (brojPoena >0 && brojPoena <=100){
        return brojPoena /10;
        }
        else{
            System.out.println("Broj poena preko 100. Prevara i korupcija! Upisana ocena 0");
            return 0;
        }
    }

    @Override
    public String toString() {
        return
                "broj poena=" + brojPoena +
                ", ocena=" + ocena +
                ", naziv predmeta='" + nazivPredmeta + '\'' +
                ", rok odrzavanja ispita='" + rokOdrzavanjaIspita + '\'';
    }

    public double izracunajProsek (ArrayList<Ocene> lista){
        double zbirOcena=0;
        for (int i=0; i<lista.size(); i++){
            zbirOcena=zbirOcena + lista.get(i).getOcena();
     //       System.out.println(zbirOcena);
        }
    //    System.out.println(zbirOcena);
  //      System.out.println(lista.size());
//        System.out.println(zbirOcena/ lista.size());
        //double pera = zbirOcena;
        return zbirOcena/lista.size();
    }


}
