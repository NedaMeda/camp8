import java.util.ArrayList;

public class Predstava {
    //Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
    //Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
    //Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom,
    //a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
private String nazivPredstave;
private Pozoriste pozoriste;
private ArrayList<Zaposleni> listaZaposlenih;

    public Predstava(String nazivPredstave, Pozoriste pozoriste, ArrayList<Zaposleni> listaZaposlenih) {
        this.nazivPredstave = nazivPredstave;
        this.pozoriste = pozoriste;
        this.listaZaposlenih = listaZaposlenih;
    }

    public ArrayList<Zaposleni> getListaZaposlenih() {
        return listaZaposlenih;
    }

    public void setListaZaposlenih(ArrayList<Zaposleni> listaZaposlenih) {
        this.listaZaposlenih = listaZaposlenih;
    }

    public void addZaposleni(Zaposleni zaposleni){
        listaZaposlenih.add(zaposleni);
    }

    public void removeZaposleni (int index){
        listaZaposlenih.remove(index);
    }

    public int brojZaposlenih(){
        return listaZaposlenih.size();
    }
    //Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom,
    //a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).

    @Override
    public String toString() {
            String noviString="\n";
            for (int i=0; i< listaZaposlenih.size();i++){
                noviString=noviString.concat(listaZaposlenih.get(i).getImePrezime());
                noviString=noviString.concat("\n");
             //   System.out.println(">>>" + noviString);
            }

        return nazivPredstave + ", " + pozoriste.getNazivPozorista() + noviString ;
    }

}

