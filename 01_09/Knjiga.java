public class Knjiga {

    //naziv, autor (class), brstr, godizd, get set

    private String naziv;
    private Autor autor;
    private int brStrana;
    private int godIzdanja;

    public Knjiga(String naziv, Autor autor, int brStrana) {
        this.naziv = naziv;
        this.autor = autor;
        this.brStrana = brStrana;
    }

    public String getNaziv() {
        return naziv;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getBrStrana() {
        return brStrana;
    }

    public int getGodIzdanja() {
        return godIzdanja;
    }

    public void setGodIzdanja(int godIzdanja) {
        this.godIzdanja = godIzdanja;
    }

    @Override
    public String toString() {
        return
                "Naziv knjige = '" + naziv + '\'' +
                ", Autor = " + autor +
                ", brStrana = " + brStrana +
                ", godIzdanja = " + godIzdanja +
                ' ';
    }
}
