package com.neda.finalniprojekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dresses {

    public static String url = "http://automationpractice.com/index.php?id_category=11&controller=category";
    private static String moreXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[2]/span[1]";
    private static String seconddressXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]";

    public static WebElement getMore(WebDriver wd) {
        return wd.findElement(By.xpath(moreXpath));
    }

    public static WebElement getSecondDress(WebDriver wd) {
        return wd.findElement(By.xpath(seconddressXpath));
    }


}
