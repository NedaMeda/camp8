import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UlazIzlazTest {
    public static void main(String[] args) throws IOException {
        String putanja = "noviExcel.xlsx";
        UlazIzlazExcel uie = new UlazIzlazExcel();
        FileInputStream fi=uie.otvaranjeStreama(putanja);
        uie.postavljanjeWB(fi);
        uie.postavljanjeSheeta(0);
        uie.postavljanjeCelije(1,1);
        System.out.println(uie.citanjeIzCelije());
        uie.pisanjeUCeliju("aaaa");
        System.out.println(uie.citanjeIzCelije());
        FileOutputStream fo= new FileOutputStream(putanja);
        uie.snimanjeFilea(fo);

    }
    }
