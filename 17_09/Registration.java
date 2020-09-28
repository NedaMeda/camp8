import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {

    public static String userIdXpath = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
    public static String newPassXpath = "//input[@name='password']";
    public static String repeatPassXpath = "//input[@name='repeatedPassword']";
    public static String firstNameXpath = "//input[@name='account.firstName']";
    public static String lastNameXpath = "//input[@name='account.lastName']";
    public static String emailXpath = "//input[@name='account.email']";
    public static String phoneXpath = "//input[@name='account.phone']";
    public static String address1Xpath = "//input[@name='account.address1']";
    public static String address2Xpath = "//input[@name='account.address2']";
    public static String cityXpath = "//input[@name='account.city']";
    public static String stateXpath = "//input[@name='account.state']";
    public static String zipXpath = "//input[@name='account.zip']";
    public static String countryXpath = "//input[@name='account.country']";
    public static String registerButtonXpath = "//input[@name='newAccount']";




    public static WebElement getUserIDName (WebDriver driver) {
        return driver.findElement(By.xpath(userIdXpath));
    }
        public static WebElement getPasswordName (WebDriver driver){
            return driver.findElement(By.xpath(newPassXpath));
        }
    public static WebElement getRepeatPasswordName (WebDriver driver) {
        return driver.findElement(By.xpath(repeatPassXpath));
    }

    public static WebElement getFirstName (WebDriver driver) {
        return driver.findElement(By.xpath(firstNameXpath));
    }

    public static WebElement getLastName (WebDriver driver) {
        return driver.findElement(By.xpath(lastNameXpath));
    }

    public static WebElement getEmail (WebDriver driver) {
        return driver.findElement(By.xpath(emailXpath));
    }

    public static WebElement getPhone (WebDriver driver) {
        return driver.findElement(By.xpath(phoneXpath));
    }

    public static WebElement getAddress1 (WebDriver driver) {
        return driver.findElement(By.xpath(address1Xpath));
    }

    public static WebElement getAddress2 (WebDriver driver) {
        return driver.findElement(By.xpath(address2Xpath));
    }

    public static WebElement getCity (WebDriver driver) {
        return driver.findElement(By.xpath(cityXpath));
    }

    public static WebElement getState (WebDriver driver) {
        return driver.findElement(By.xpath(stateXpath));
    }

    public static WebElement getZip (WebDriver driver) {
        return driver.findElement(By.xpath(zipXpath));
    }

    public static WebElement getCountry (WebDriver driver) {
        return driver.findElement(By.xpath(countryXpath));
    }

    public static WebElement getRegButton (WebDriver driver) {
        return driver.findElement(By.xpath(registerButtonXpath));
    }



    public static void setUserId (WebDriver wd, String id) {
        getUserIDName(wd).sendKeys(id);
    }

    public static void setPassword (WebDriver wd, String password) {
        getPasswordName(wd).sendKeys(password);
    }

    public static void setRepeatPassword (WebDriver wd, String repeatPassword) {
        getRepeatPasswordName(wd).sendKeys(repeatPassword);
    }

    public static void setFirstName (WebDriver wd, String id) {
        getFirstName(wd).sendKeys(id);
    }

    public static void setLastName (WebDriver wd, String id) {
        getLastName(wd).sendKeys(id);
    }


    public static void setEmail (WebDriver wd, String id) {getEmail(wd).sendKeys(id);}

    public static void setPhone (WebDriver wd, String id) {getPhone(wd).sendKeys(id);}

    public static void setAddress1 (WebDriver wd, String id) {getAddress1(wd).sendKeys(id);}

    public static void setAddress2 (WebDriver wd, String id) {getAddress2(wd).sendKeys(id);}

    public static void setCity (WebDriver wd, String id) {getCity(wd).sendKeys(id);}

    public static void setState (WebDriver wd, String id) {getState(wd).sendKeys(id);}

    public static void setZip (WebDriver wd, String id) {getZip(wd).sendKeys(id);}

    public static void setCountry (WebDriver wd, String id) {getCountry(wd).sendKeys(id);}

    public static void pressButton (WebDriver wd) {getRegButton(wd).click();}







}

