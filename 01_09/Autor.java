public class Autor {

    //ime, prezime,rodj zadati u konstruktoru +get
private String ime;
private String prezime;
private int godRodj;

    public Autor(String ime, String prezime, int godRodj) {
        this.ime = ime;
        this.prezime = prezime;
        this.godRodj = godRodj;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodRodj() {
        return godRodj;
    }

    @Override
    public String toString() {
        return ime + ' ' +
                 prezime;
    }
}
