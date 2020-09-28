public class Zadatak3 {
    public static void main(String[]ulaznipodaci){
        String imeKolege;
        imeKolege = ulaznipodaci[0];

        switch (imeKolege){
            case "Marko":
                System.out.println("duzina vaseg imena je "+imeKolege.length()+" i zovete se "+imeKolege);
                break;
            case "Sandra":
                System.out.println("duzina vaseg imena je "+imeKolege.length()+" i zovete se "+imeKolege);
                break;
            case "Dijana":
                System.out.println("duzina vaseg imena je "+imeKolege.length()+" i zovete se "+imeKolege);
                break;
            case "Uros":
                System.out.println("duzina vaseg imena je "+imeKolege.length()+" i zovete se "+imeKolege);
                break;
            case "Jelena":
                System.out.println("duzina vaseg imena je "+imeKolege.length()+" i zovete se "+imeKolege);
                break;
            default:
                System.out.println("duzina vaseg imena je "+imeKolege.length()+" i nije u bazi podataka");


        }

    }
}
