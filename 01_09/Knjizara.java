public class Knjizara {
    public static void main(String[] args) {

        Autor a1=new Autor("Pisac","Pisic", 1960);
        Autor a2=new Autor("Zvrlj","Brlj", 1970);
        Autor a3=new Autor("Trta","Mrtic", 1980);

        Knjiga k1=new Knjiga("Knjiga nad Knjigama", a1, 200);
        Knjiga k2=new Knjiga("Knjigaaaa", a2, 300);
        Knjiga k3=new Knjiga("Manuskript", a3, 400);
        k1.setGodIzdanja(2020);
        k2.setGodIzdanja(2021);
        k3.setGodIzdanja(2018);

        if (k1.getGodIzdanja()>k2.getGodIzdanja()){
            if (k2.getGodIzdanja()> k3.getGodIzdanja()){
                System.out.println(k1.toString());
                System.out.println(k2.toString());
                System.out.println(k3.toString());
                }
            else {
                System.out.println(k1.toString());
                System.out.println(k3.toString());
                System.out.println(k2.toString());
            }
        }
        else if (k2.getGodIzdanja()>k3.getGodIzdanja()){
            if (k3.getGodIzdanja()>k1.getGodIzdanja()){
                System.out.println(k2.toString());
                System.out.println(k3.toString());
                System.out.println(k1.toString());
            }
            else{
                System.out.println(k2.toString());
                System.out.println(k1.toString());
                System.out.println(k3.toString());
            }
        }
        else{
            System.out.println(k3.toString());
            System.out.println(k2.toString());
            System.out.println(k1.toString());


        }
    }
}
