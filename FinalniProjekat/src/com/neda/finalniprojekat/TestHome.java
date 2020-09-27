package com.neda.finalniprojekat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;

public class TestHome {

    private WebDriver wd;
    private String dressTarget = "http://automationpractice.com/index.php?id_category=11&controller=category";
    private String openURL1;
    private String openURL2;
    private String faceTarget = "https://www.facebook.com/groups/525066904174158/";
    private String twitterTarget = "https://twitter.com/seleniumfrmwrk";
    private String youtubeTarget = "https://www.youtube.com/channel/UCHl59sI3SRjQ-qPcTrgt0tA";
    private String gPlusTarget = "https://accounts.google.com/signin/v2/identifier?passive=1209600&osid=1&continue=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&followup=https%3A%2F%2Fplus.google.com%2F111979135243110831526%2Fposts&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

    @BeforeClass
    public void testHomePreClass() throws InterruptedException {
        //setup ChromeDriver
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();

        //load Homepage
        wd.get(Home.url);
        Thread.sleep(1500);
    }

    @AfterClass
    public void testHomeAfterClass(){
        System.out.println("--> Home Class Tests Complete <--");
    wd.close();
    }

    @Test

    public void homeTestSummerDresses() throws InterruptedException {
        System.out.println("Begin homeTestSummerDresses Test");
        System.out.println("Go to womens sommer dresses via Women>Summer Dresses");
        System.out.println("Test if opened page is correct");

        //navigate to Summer Dresses using mouse via WOMAN > SUMMER DRESSES from the menu
        WebElement women = Home.getWomenElement(wd);
        WebElement dress = Home.getSummerDressElement(wd);

        Actions akcija = new Actions(wd);
        akcija.moveToElement(women).build().perform();
        Thread.sleep(1500);
        dress.click();
        Thread.sleep(1500);

        //store and compare URL of current page to target URL
        openURL1 = wd.getCurrentUrl().toString();
        Assert.assertEquals(openURL1, dressTarget);

    }

    @Test

    public void homeTestSummerDressesPath2() throws InterruptedException {
        System.out.println("Begin homeTestSummerDresses Path 2 Test");
        System.out.println("Go to womens sommer dresses via Dresses>Summer Dresses");
        System.out.println("Test if opened page is correct");

        //navigate to Summer Dresses using mouse via DRESSES > SUMMER DRESSES from the menu
        WebElement dresses = Home.getDressElement(wd);
        WebElement summer = Home.getSummerDress2(wd);
        Actions akcija = new Actions(wd);
        akcija.moveToElement(dresses).build().perform();
        Thread.sleep(1500);
        summer.click();

        //store and compare URL of current page to target URL (different path to target taken)
        openURL2 = wd.getCurrentUrl().toString();
        Assert.assertEquals(openURL2, dressTarget);

    }

    @Test

    public void homeTestComparePaths() throws InterruptedException {
        System.out.println("Begin homeTestComparePaths Test");
        System.out.println("Compare URL's from previous two tests");

        // compare URLs of pages reached during summer dress tests
        Assert.assertEquals(openURL2, openURL1);

    }


    @Test

    public void homeTestSocialMedia() throws InterruptedException {
        System.out.println("Begin homeTestSocialMedis Test");
        System.out.println("Check if Facebook, Twitter, Youtube and GooglePlus links work");

        //load homepage
        wd.get(Home.url);
        Thread.sleep(1500);

        SoftAssert sa1 = new SoftAssert();

        //test socMedia buttons

        //Facebook
        WebElement facebook = Home.getFacebook(wd);
        facebook.click();
        Thread.sleep(1000);

        //get list of tabs and switch driver to second tab
        ArrayList<String> linkF = new ArrayList<String>(wd.getWindowHandles());
        wd.switchTo().window(linkF.get(1));
        System.out.println(wd.getCurrentUrl().toString());

        sa1.assertEquals(wd.getCurrentUrl().toString(), faceTarget);

        Thread.sleep(1000);

        //close tab and switch driver to first tab
        wd.close();
        wd.switchTo().window(linkF.get(0));


        //Twitter
        WebElement twitter = Home.getTwitter(wd);
        twitter.click();
        Thread.sleep(1000);
        ArrayList<String> linkT = new ArrayList<String>(wd.getWindowHandles());
        wd.switchTo().window(linkT.get(1));
        System.out.println(wd.getCurrentUrl().toString());

        sa1.assertEquals(wd.getCurrentUrl().toString(), twitterTarget);

        Thread.sleep(1000);
        wd.close();
        wd.switchTo().window(linkF.get(0));

        //Youtube
        WebElement youtube = Home.getYoutube(wd);
        youtube.click();
        Thread.sleep(1000);
        ArrayList<String> linkY = new ArrayList<String>(wd.getWindowHandles());
        wd.switchTo().window(linkY.get(1));
        System.out.println(wd.getCurrentUrl().toString());

        sa1.assertEquals(wd.getCurrentUrl().toString(), youtubeTarget);

        Thread.sleep(1000);
        wd.close();
        wd.switchTo().window(linkF.get(0));

        //Google Plus
        WebElement gPlus = Home.getGPlus(wd);
        gPlus.click();
        Thread.sleep(1000);
        ArrayList<String> linkG = new ArrayList<String>(wd.getWindowHandles());
        wd.switchTo().window(linkG.get(1));
        System.out.println(wd.getCurrentUrl().toString());

        sa1.assertEquals(wd.getCurrentUrl().toString(), gPlusTarget);
        //google plus no longer functional. gPlusTarget is for non-logged-in users
        Thread.sleep(1000);
        wd.close();
        wd.switchTo().window(linkF.get(0));

        sa1.assertAll();

    }

    @Test

    public void homeTestContactUs() throws InterruptedException {
        System.out.println("Begin homeTestContactUs Test");
        System.out.println("Go to ContactUs page via two different links");
        System.out.println("Test if opened pages through both links are the same");

        //load homepage
        wd.get(Home.url);
        Thread.sleep(1500);

        SoftAssert sa1 = new SoftAssert();

        //Test opening ContactUs page via path 1
        WebElement contactPath1 = Home.getContact(wd);
        contactPath1.click();
        Thread.sleep(1500);
        String URL1 = wd.getCurrentUrl();

        sa1.assertEquals(ContactUs.url, URL1);

        wd.navigate().back();
        Thread.sleep(1500);

        //Test opening ContactUs page via path 2
        WebElement contactPath2 = Home.getContact2(wd);
        contactPath2.click();
        String URL2 = wd.getCurrentUrl();

        sa1.assertEquals(ContactUs.url, URL2);

        wd.navigate().back();
        Thread.sleep(1500);

        //Compare URLs reached via two different Contact Us links.
        sa1.assertEquals(URL1, URL2);

        sa1.assertAll();

    }

}
