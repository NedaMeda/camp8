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

//Koristeci svoju tabelu sa potrebnim vrednostima, automatizovati kupovinu na sajtu https://www.saucedemo.com. Proci kroz sledece stavke:
//a) Ulogovati se sa ispravnim kredencijalima(na sajtu su ispisani ispravni kredencijali, probati sa 2 username-a)
//b) Izabrati da redosled proizvoda bude od najjeftinijeg do najskupljeg
//c) Dodati najskuplji proizvod u cart
//d) Preci na korak za placanje i popuniti neophodna polja
//e) Uspesno zavrsiti kupovinu
//
//Dodatno: Izvuci informaciju (mozete i rucno) o iznosu takse na kupovinu, nazivu proizvoda i payment information (#nekbrojevi)
// te iste informacije ubaciti u tabelu a zatim prilikom dolaska na tu stranicu kroz test,
// proveriti da li se ta dva parametra poklapaju sa onim sto imate u vasoj tabeli.

public class Domaci {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nedaz\\Downloads\\chromedriver_win32\\chromedriver.exe");// Putanja do chrome drivera
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        XSSFWorkbook wb;
        FileInputStream fi;

        try {
            fi = new FileInputStream("domaci1.xlsx");
            wb = new XSSFWorkbook(fi);
            Sheet sheet = wb.getSheetAt(0);
            Row row = sheet.getRow(0);
            Cell cell = row.getCell(0);
            Cell cell1 = row.getCell(1);
            Cell cell2 = row.getCell(2);
            Cell cell3 = row.getCell(3);
            Cell cell4 = row.getCell(4);

            System.out.println(cell.toString()+ " "+cell1.toString());

            WebElement ime = driver.findElement(By.cssSelector("#user-name"));
            ime.sendKeys(cell.toString());
            WebElement pass = driver.findElement(By.cssSelector("#password"));
            pass.sendKeys(cell1.toString());
            WebElement date = driver.findElement(By.cssSelector("#login-button"));
            date.click();
            Thread.sleep(2500);

            Select sort = new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/select[1]")));
            sort.selectByValue("lohi");
            Thread.sleep(1500);

            WebElement selectItem = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[6]/div[3]/button[1]"));
            selectItem.click();
            WebElement selectCart = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/a[1]/*[local-name()='svg'][1]/*[name()='path'][1]"));
            selectCart.click();
            Thread.sleep(1500);

            WebElement selectBuy = driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
            selectBuy.click();
            WebElement checkoutIme = driver.findElement(By.cssSelector("#first-name"));
            checkoutIme.sendKeys(cell2.toString());
            WebElement checkoutPrezime = driver.findElement(By.cssSelector("#last-name"));
            checkoutPrezime.sendKeys(cell3.toString());
            WebElement checkoutPost = driver.findElement(By.cssSelector("#postal-code"));
            checkoutPost.sendKeys(cell4.toString());
            WebElement selectSubmit = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
            selectSubmit.click();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





    }
}






