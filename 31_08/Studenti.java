import java.util.Arrays;
import java.util.Scanner;

public class Studenti {
    private String imePrezime;
    private int brIndexa;
    private String smer;
    private int[] ispiti=new int[5];

    public Studenti(String imePrezime, int brIndexa, String smer, int[] ispiti) {
        this.imePrezime = imePrezime;
        this.brIndexa = brIndexa;
        this.smer = smer;
        this.ispiti = ispiti;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public String getSmer() {
        return smer;
    }

    public int[] getIspiti() {
        return ispiti;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public void setIspiti() {
        int rezIspita;
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<ispiti.length; i++){



            while (true){
                System.out.println("Unesite rezultate ispita:");
                rezIspita=sc.nextInt();
                if (rezIspita>=0 && rezIspita<100){
                    ispiti[i]=rezIspita;
                    break;
                }
                else {
                    System.out.printf("Uneli ste rezultat van opsega 0-100. Probajte ponovo");
                }

            }

        }
    }

    @Override
    public String toString() {
        return "Studenti{" +
                "imePrezime='" + imePrezime + '\'' +
                ", brIndexa=" + brIndexa +
                ", smer='" + smer + '\'' +
                ", ispiti=" + Arrays.toString(ispiti) +
                '}';
    }
}
