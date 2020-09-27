package com.neda.finalniprojekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Details {

    private static String addItemXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/p[1]/a[2]/span[1]/i[1]";
    private static String chooseSizeID = "group_1";
    private static String chooseColorXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[2]/div[1]/fieldset[2]/div[1]/ul[1]/li[1]/a[1]";
    private static String addToCartXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]/span[1]";

    public static WebElement getAddItem (WebDriver wd){
        return wd.findElement(By.xpath(addItemXpath));
    }
    public static WebElement getChooseSize (WebDriver wd){ return wd.findElement(By.id(chooseSizeID)); }
    public static WebElement getChooseColor (WebDriver wd){
        return wd.findElement(By.xpath(chooseColorXpath));
    }
    public static WebElement getAddToCart (WebDriver wd){
        return wd.findElement(By.xpath(addToCartXpath));
    }



}
