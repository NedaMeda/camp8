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
import java.io.IOException;

public class MainDomaci {

    //Koristeci Selenium webdriver otici na sajt
    //https://www.techlistic.com/p/selenium-practice-form.html
    //i popuniti formu (idealno celu, ako ne ide onda probajte bar do kontinenta)
    //Potrudite se da koristite vise nacina (lokatora) za pronalazenje elemenata.

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nedaz\\Downloads\\chromedriver_win32\\chromedriver.exe");// Putanja do chrome drivera
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        XSSFWorkbook wb;
        FileInputStream fi;

        try {
            fi = new FileInputStream("primer1.xlsx");
            wb = new XSSFWorkbook(fi);

            Sheet sheet = wb.getSheetAt(0);
            Row row = sheet.getRow(2);
            Cell cellIme = row.getCell(0);
            //Cell cell3 = row.getCell(1);
            //System.out.println(cell.toString()+ " "+cell3.toString());

            WebElement ime = driver.findElement(By.cssSelector("#firstName"));
            ime.sendKeys(cellIme.toString());
            WebElement prezime = driver.findElement(By.cssSelector("#lastName"));
            Cell cellPrezime = row.getCell(1);
            prezime.sendKeys(cellPrezime.toString());
            WebElement email = driver.findElement(By.cssSelector("#userEmail"));
            Cell cellEmail = row.getCell(2);
            email.sendKeys(cellEmail.toString());

            Cell cellGender = row.getCell(3);

            switch (cellGender.toString()){
                case "M":
                    WebElement genderM = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
                    genderM.click();
                    break;
                case "F":
                    WebElement genderF = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
                    genderF.click();
                    break;
                case "O":
                    WebElement genderO = driver.findElement(By.xpath("//label[contains(text(),'Other')]"));
                    genderO.click();
                    break;
                    default:
                    System.out.println("GRESKA! Default postavlja Other");
                        WebElement genderX = driver.findElement(By.xpath("//label[contains(text(),'Other')]"));
                        genderX.click();
                        break;
            }

            Cell cellMobile = row.getCell(4);

            //double broj = row.getCell(4).getNumericCellValue();
           // System.out.println(broj);
           // int zika = (int) broj;
           // System.out.println(zika);

            WebElement mobile = driver.findElement(By.id("userNumber"));
            mobile.sendKeys(cellMobile.toString());
            System.out.println(cellMobile.toString());

            Cell cellDate = row.getCell(5);

            WebElement date = driver.findElement(By.id("dateOfBirthInput"));
            date.click();
                 Thread.sleep(500);

            Select date1 = new Select(driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']")));
            date1.selectByVisibleText("24");

            //div[@class='react-datepicker__day react-datepicker__day--024']
     //       date.sendKeys(cellDate.toString());

            //dateOfBirthInput


            Row row1 = sheet.getRow(1);
            Cell cell1 = row1.getCell(0);
            Cell cell2 = row1.getCell(1);

            System.out.println(cell1.toString()+" "+cell2.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }









    }
}
