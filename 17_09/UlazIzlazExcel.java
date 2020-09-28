import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Napraviti klasu za citanje excel tabele koja poseduje metodu koja kreira potreban tok podataka
//kojoj se prosledjuje putanja do fajla i metodu kojoj se prosledjuju dva cela broja
// (jedan za red, drugi za kolonu u tabeli).
//Koristeci istu klasu, pristupiti tabeli i citati podatke koji se nalaze u zadatom redu i koloni.
//
//Dodatak: Nadograditi klasu da omogucava i unos podataka u zadati red i kolonu.

public class UlazIzlazExcel {

    private static int red = 0;
    private static int kolona = 0;
    private static Workbook wb;
    private static Sheet sheet;


    public static FileInputStream otvaranjeStreama (String putanja) {

    //XSSFWorkbook wb;
    FileInputStream fi;

    try {

        fi = new FileInputStream(putanja);
        //wb = new XSSFWorkbook(fi);
        System.out.println("Stream otvoren");
        return fi;

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;
}

public void snimanjeFilea (FileOutputStream fo){
        try {
        wb.write(fo);
        //wb.close(); //zatvaranje file-a (nije ovo dobro mesto za to)
    } catch (FileNotFoundException e) {
        System.out.println("Doslo je do greske");
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

}

public void postavljanjeWB(FileInputStream fi) throws IOException {

    this.wb = new XSSFWorkbook(fi);


}
    public void postavljanjeSheeta ( int brojSheeta){

        this.sheet = wb.getSheetAt(brojSheeta);

    }

public void postavljanjeCelije (int red, int kolona){

    this.red = red;
    this.kolona = kolona;

}


    public Cell citanjeCelije (){

        Row row = sheet.getRow(red);
        Cell celija = row.getCell(kolona);
        return celija;

    }
    public String citanjeIzCelije (){

    Row row = sheet.getRow(red);
    Cell celija = row.getCell(kolona);
    return celija.toString();

}

    public void pisanjeUCeliju (String upis){

        Row row = sheet.getRow(red);
        Cell celija = row.getCell(kolona);
        celija.setCellValue(upis);
        //return celija.toString();

    }

}








