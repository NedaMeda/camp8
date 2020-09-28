public class Reditelj extends Zaposleni{
    //Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].

    private String nadimakReditelja;

    public Reditelj(String imePrezime, Pozoriste pozoriste, String nadimakReditelja) {
        super(imePrezime, pozoriste);
        this.nadimakReditelja = nadimakReditelja;
    }

    public String getNadimakReditelja() {
        return nadimakReditelja;
    }

    @Override
    public String toString() {
        return nadimakReditelja + "_" + super.getImePrezime() + "[" + super.getPozoriste().getNazivPozorista() + "]";

    }
}
