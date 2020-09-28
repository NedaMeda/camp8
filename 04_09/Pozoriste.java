public class Pozoriste {
    //Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv koji mogu da se dohvate.
    //Moze da se sastavi tekstualni opis u obliku naziv[id].
    //
    //Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen.
    //Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].
    //
    //Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].
    //
    //Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].
    //
    //Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
    //Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
    //Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se predstava odrzava razdvojene zarezom,
    //a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).

private static int id=1;
private int jedinstveniBroj=id++;
private String nazivPozorista;

    public Pozoriste(String nazivPozorista) {
        this.nazivPozorista = nazivPozorista;
    }

    public int getJedinstveniBroj() {
        return jedinstveniBroj;
    }

    public String getNazivPozorista() {
        return nazivPozorista;
    }

    @Override
    public String toString() {
        return nazivPozorista + "[" + jedinstveniBroj + "]";
    }
}
