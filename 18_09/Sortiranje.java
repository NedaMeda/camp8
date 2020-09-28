import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


//Sortirati dugmice obrnutim redosledom sa stranice https://demoqa.com/sortable (iz opcije grid)
//Na stranici https://demoqa.com/webtables :
//- obrisati 2 od 3 postojece tabele
//- preostalu tabelu editovati sa random parametrima
//- napraviti jednu tabelu sa svojim random parametrima

public class Sortiranje {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver.exe");// Putanja do chrome drivera
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/sortable");

        Thread.sleep(1500);
        WebElement grid = driver.findElement(By.xpath("//a[@id='demo-tab-grid']"));
        grid.click();
        Thread.sleep(2000);


        WebElement dragButtonOne = driver.findElement(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Four')]"));
        //dragButtonOne.click();
        Actions akcija = new Actions (driver);
        akcija.clickAndHold(dragButtonOne).moveByOffset(200,0);
        akcija.release();
        akcija.perform();

        Thread.sleep(2000);
//div[contains(text(),'Nine')]

        WebElement dragButtonNine = driver.findElement(By.xpath("//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Three')]"));
        //dragButtonNine.click();
        akcija.clickAndHold(dragButtonNine).moveByOffset(-200,0);
        akcija.release();

        akcija.perform();
        Thread.sleep(2000);

        driver.navigate().to("https://demoqa.com/webtables");

        Thread.sleep(200);

        WebElement delete = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[2]/*[local-name()='svg'][1]/*[name()='path'][1]"));
        delete.click();
        Thread.sleep(200);
        WebElement delete2 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[2]/*[local-name()='svg'][1]/*[name()='path'][1]"));
        delete2.click();

        WebElement edit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[1]/*[local-name()='svg'][1]/*[name()='path'][1]"));
        edit.click();

        Thread.sleep(200);
        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.clear();
        firstName.sendKeys("Zika");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.clear();
        lastName.sendKeys("Zikic");
        WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        userEmail.clear();
        userEmail.sendKeys("zika@gmail.com");
        WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.clear();
        age.sendKeys("50");
        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.clear();
        salary.sendKeys("50000");
        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.clear();
        department.sendKeys("Ministarstvo za rudu");
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

        Thread.sleep(500);

        WebElement add = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        add.click();

        Thread.sleep(500);

        WebElement firstName2 = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName2.clear();
        firstName2.sendKeys("Pera");
        WebElement lastName2 = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName2.clear();
        lastName2.sendKeys("Petrovic");
        WebElement userEmail2 = driver.findElement(By.xpath("//input[@id='userEmail']"));
        userEmail2.clear();
        userEmail2.sendKeys("pera@gmail.com");
        WebElement age2 = driver.findElement(By.xpath("//input[@id='age']"));
        age2.clear();
        age2.sendKeys("60");
        WebElement salary2 = driver.findElement(By.xpath("//input[@id='salary']"));
        salary2.clear();
        salary2.sendKeys("15000");
        WebElement department2 = driver.findElement(By.xpath("//input[@id='department']"));
        department2.clear();
        department2.sendKeys("Ministarstvo za rupu");
        WebElement submit2 = driver.findElement(By.xpath("//button[@id='submit']"));
        submit2.click();



    }



}
