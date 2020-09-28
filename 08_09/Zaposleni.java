    //Koristeci fajlove https://drive.google.com/drive/folders/1rCUwm3GwuBYEzdttYLHilmdxyWc-63DY
    //potrebno je napraviti test za ispravnost klase Zaposleni.
    //Ako se na osnovu testova pronađe neka greška u kodu potrebno je da se popravi originalni kod.
    //Proveriti da li konstruktor public Zaposleni dobro postavlja argumente,
    //kao i da li get metode vraćaju odgovarajuće vrednosti.
    //Navesti 3 before/after anotacije i objasniti njihovu funkciju.


import java.util.Date;

    /*
     # Zaposleni [P]
       Zaposleni ima naziv( string - ime i prezime ), godinu rodjenja i datum kada se zaposlio.
       Naziv se zadaje prilikom kreiranaj i moguce ga je dohvatiti i naknadno postaviti.
       Godina rodjenja se zadaje prilikom kreiranja i moguce je samo dohvatiti.
       Datum kada se zaposlio se zadaje prilikom kreiranja i moguce ga je samo dohvatiti.
     */
    public class Zaposleni {
        private String naziv;
        private int godRodjenja;
        private Date datumZap;
        protected char oznaka;

        public Zaposleni(String naziv, int godRodjenja, Date datumZap) {
            this.naziv = naziv;
            this.godRodjenja = godRodjenja;
            this.datumZap = datumZap;
        }

        public void setNaziv(String naziv) {
            this.naziv = naziv;
        }

        public String getNaziv() {
            return naziv;
        }

        public int getGodRodjenja() {
            return godRodjenja;
        }

        public Date getDatumZap() {
            return datumZap;
        }
    }

