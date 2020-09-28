public class Zgrada {


        //Napraviti sopstvenu klasu Zgrada.
        //Zgrada ima adresu na kojoj se nalazi, spratnost, broj stanova, prezimena stanara.
        //Sve tipove metoda u ovoj klasi treba iskoristiti u glavnom programu gde cete kreirati dve zgrade.
        // Sva polja mogu da se dohvate i postave.


        private String adresa;
        private int sprat;
        private int brStanova;
        private String[] prezimena=new String[brStanova];

    public Zgrada(int brStanova, String[]prezimena){
        this.prezimena = prezimena;
        this.brStanova= brStanova;


    }

        public void setAdresa(String adresa){
            this.adresa=adresa;
        }
        public String getAdresa(){
            return adresa;
        }
        public void setSprat(int sprat){
            this.sprat=sprat;
        }
        public int getSprat(){
            return sprat;
        }
        public void setBrStanova(int brStanova){
            this.brStanova=brStanova;
        }
        public int getBrStanova(){
            return brStanova;
        }
        public void setPrezime(String prezime, int brStana){
            prezimena[brStana]=prezime;
        }
        public String getPrezime(int brStana){
            return prezimena[brStana];
        }
        public void popuniStanare(String[]spisakStanara, int brojStanova){
            for(int i=0; i<brojStanova; i++){
                prezimena[i]=spisakStanara[i];
            }
        }
}
