package com.neda.finalniprojekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

    public static String url = "http://automationpractice.com/index.php";
    private static String womenXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]";
    private static String summerdressXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[2]/ul[1]/li[3]/a[1]";
    private static String dressXpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]";
    private static String summerdress2Xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[3]/a[1]";
    private static String searchCSS = "#search_query_top";
    private static String contactXpath = "//div[@id='contact-link']//a[contains(text(),'Contact us')]";
    private static String contact2Xpath = "//li[@class='item']//a[contains(text(),'Contact us')]";
    private static String facebookXpath = "//li[@class='facebook']//a";
    private static String twitterXpath = "//li[@class='twitter']//a";
    private static String youtubeXpath = "//li[@class='youtube']//a";
    private static String gplusXpath = "//li[@class='google-plus']//a";


    public static WebElement getWomenElement(WebDriver wd) {
        return wd.findElement(By.xpath(womenXpath));
    }

    public static WebElement getSummerDressElement(WebDriver wd) {
        return wd.findElement(By.xpath(summerdressXpath));
    }

    public static WebElement getDressElement(WebDriver wd) {
        return wd.findElement(By.xpath(dressXpath));
    }

    public static WebElement getSummerDress2(WebDriver wd) {
        return wd.findElement(By.xpath(summerdress2Xpath));
    }

    public static WebElement getSearch(WebDriver wd) {
        return wd.findElement(By.cssSelector(searchCSS));
    }

    public static WebElement getContact(WebDriver wd) {
        return wd.findElement(By.xpath(contactXpath));
    }

    public static WebElement getContact2(WebDriver wd) {
        return wd.findElement(By.xpath(contact2Xpath));
    }

    public static WebElement getFacebook(WebDriver wd) {
        return wd.findElement(By.xpath(facebookXpath));
    }

    public static WebElement getTwitter(WebDriver wd) {
        return wd.findElement(By.xpath(twitterXpath));
    }

    public static WebElement getYoutube(WebDriver wd) {
        return wd.findElement(By.xpath(youtubeXpath));
    }

    public static WebElement getGPlus(WebDriver wd) {
        return wd.findElement(By.xpath(gplusXpath));
    }


}
