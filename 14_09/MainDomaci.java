import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MainDomaci {

    //Koristeci Selenium webdriver otici na sajt
    //https://www.techlistic.com/p/selenium-practice-form.html
    //i popuniti formu (idealno celu, ako ne ide onda probajte bar do kontinenta)
    //Potrudite se da koristite vise nacina (lokatora) za pronalazenje elemenata.

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nedaz\\Downloads\\chromedriver_win32\\chromedriver.exe");// Putanja do chrome drivera
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        WebElement ime = driver.findElement(By.xpath("//input[@name='firstname']"));
  //      ime.sendKeys(Keys.PAGE_DOWN);

  //      ime.sendKeys(Keys.PAGE_DOWN);
        ime.sendKeys("Milence");
        WebElement prezime = driver.findElement(By.xpath("//input[@name='lastname']"));
        prezime.sendKeys("Pilence");
        WebElement pol = driver.findElement(By.xpath("//input[@id='sex-0']"));
        pol.click();
        WebElement iskustvo = driver.findElement(By.xpath("//input[@id='exp-4']"));
        iskustvo.click();
        WebElement profesija = driver.findElement(By.cssSelector("#profession-0"));
        profesija.click();
        WebElement alat = driver.findElement(By.cssSelector("#tool-2"));
        alat.click();
        WebElement datum = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[18]/input[1]"));
        datum.sendKeys("01-01-1979");
        Select kontinent = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
        kontinent.selectByVisibleText("Australia");

        Select komande = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
        komande.selectByVisibleText("WebElement Commands");

        WebElement izaberiFile = driver.findElement(By.cssSelector("#photo"));
        izaberiFile.sendKeys("C:\\Users\\nedaz\\Desktop\\milic.jpg");

        WebElement svuci = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[29]/div[2]/div[1]/a[1]"));
        svuci.click();
        Thread.sleep(1500);
        driver.navigate().back();
        WebElement posalji = driver.findElement(By.id("submit"));
        posalji.click();



    }
}
