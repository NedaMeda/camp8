

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class RegistrationTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		wd.get(Home.url);
		Home.clickEnterTheStore(wd);
		Catalog.clickSignIn(wd);
		LogIn.clickRegisterNow(wd);
		Registration.setUserId(wd,"Zika");
		Registration.setPassword(wd, "12345");
		Registration.setRepeatPassword(wd, "12345");
		Registration.setFirstName(wd, "Zika");
		Registration.setLastName(wd,"Zikic");
		Registration.setEmail(wd,"zika@gmail.com");
		Registration.setPhone(wd,"0641234567");
		Registration.setAddress1(wd,"Zikiceva");
		Registration.setAddress2(wd,"21");
		Registration.setCity(wd,"Zikicinci");
		Registration.setState(wd,"Zikianovac");
		Registration.setZip(wd,"11111");
		Registration.setCountry(wd,"Zikanija");
		Registration.pressButton(wd);



	}

}
