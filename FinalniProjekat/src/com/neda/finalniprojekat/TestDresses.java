package com.neda.finalniprojekat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.List;

public class TestDresses {


    private WebDriver wd;
    private String quantityTarget = "2";
    private String attributesTarget = "White, M";
    private String titleTarget = "Printed Summer Dress";


    @BeforeClass
    public void testHomePreClass() throws InterruptedException {
        //setup ChromeDriver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();

        //load Dresses-page
        wd.get(Dresses.url);
        Thread.sleep(1500);

    }
    @AfterClass
    public void testDressesAfterClass(){
        System.out.println("--> Dresses Class Tests Complete <--");
        wd.close();
    }

    @Test

    public void homeTestChooseSecondDress() throws InterruptedException {
        System.out.println("Begin homeTestChooseSecondDress Test");
        System.out.println("Add two of the second dress in White with the size M");
        System.out.println("Test if added items in cart are the correct type, no., size and color");

        //Choose second dress using mouse navigation and go to the more page
        WebElement secondDress = Dresses.getSecondDress(wd);
        Actions action = new Actions(wd);
        action.moveToElement(secondDress).build().perform();
        Thread.sleep(1500);
        WebElement moreButton = Dresses.getMore(wd);
        moreButton.click();
        Thread.sleep(1500);

        //on the more page select two dresses of white color and size M add to cart
        WebElement plusButton = Details.getAddItem(wd);
        plusButton.click();

        WebElement sizePick = Details.getChooseSize(wd);
        sizePick.click();
        sizePick.sendKeys("M");
        sizePick.sendKeys(Keys.ENTER);

        WebElement colorWhite = Details.getChooseColor(wd);
        colorWhite.click();

        WebElement addToCart = Details.getAddToCart(wd);
        addToCart.click();

        Thread.sleep(2000);

        //test if cart has the proper dress in proper color, proper size and proper quantity
        SoftAssert sa1 = new SoftAssert();
        sa1.assertEquals(Cart.getQuantity(wd).getText(), quantityTarget);
        sa1.assertEquals(Cart.getAttributes(wd).getText(), attributesTarget);
        sa1.assertEquals(Cart.getTitle(wd).getText(), titleTarget);
        sa1.assertAll();

    }

    @Test

    public void homeTestSearchYellowDress() throws InterruptedException {
        System.out.println("Begin homeTestSearchYellowDress Test");
        System.out.println("Search for yellow dress");
        System.out.println("Test if there are 3 avaliable in yellow color");

        SoftAssert sa1 = new SoftAssert();

        //search for yellow
        WebElement search = Home.getSearch(wd);
        search.sendKeys("yellow");
        search.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        //compare on page counter to target text to verify 3 items have been found by search
        WebElement counter = SearchResults.getCounter(wd);
        sa1.assertEquals(counter.getText(), "3 results have been found.");

        //get list of all elements with yellow color option and check if there are 3
        List<WebElement> zuteBoje = wd.findElements(By.cssSelector("a[style='background:#F1C40F;']"));
        sa1.assertEquals(zuteBoje.size(), "3");



    }
}
