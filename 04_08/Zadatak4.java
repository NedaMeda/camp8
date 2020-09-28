public class Zadatak4 {
    public static void main(String[]ulaznipodaci){

        int x=Integer.parseInt(ulaznipodaci[0]);
        int y=x;
        int z=x+y;
        System.out.println("Rezultat operacije "+x+"+"+y+" je "+z);
        if (z==1){
            System.out.println("Rezultat je jednak broju 1");
        }
        else if (z<1){
            System.out.println("Rezultat je manji od broja 1");
        }
        else {
            System.out.println("Rezultat je veci od broja 1");
        }
        z=x-y;
        System.out.println("Rezultat operacije "+x+"-"+y+" je "+z);
        if (z==1){
            System.out.println("Rezultat je jednak broju 1");
        }
        else if (z<1){
            System.out.println("Rezultat je manji od broja 1");
        }
        else {
            System.out.println("Rezultat je veci od broja 1");
        }
        z=x*y;
        System.out.println("Rezultat operacije "+x+"*"+y+" je "+z);
        if (z==1){
            System.out.println("Rezultat je jednak broju 1");
        }
        else if (z<1){
            System.out.println("Rezultat je manji od broja 1");
        }
        else {
            System.out.println("Rezultat je veci od broja 1");
        }
        z=x/y;
        System.out.println("Rezultat operacije "+x+"/"+y+" je "+z);
        if (z==1){
            System.out.println("Rezultat je jednak broju 1");
        }
        else if (z<1){
            System.out.println("Rezultat je manji od broja 1");
        }
        else {
            System.out.println("Rezultat je veci od broja 1");
        }
    }
}
