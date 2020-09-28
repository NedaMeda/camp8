import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
    private static String registerNewXpath = "//a[contains(text(),'Register Now!')]";

    public static void clickRegisterNow(WebDriver wd){
        WebElement element = wd.findElement(By.xpath(registerNewXpath));
        element.click();
    }
}
