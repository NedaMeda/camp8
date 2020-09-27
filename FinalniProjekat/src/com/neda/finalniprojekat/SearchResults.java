package com.neda.finalniprojekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResults {

    private static String counterXpath = "//span[@class='heading-counter']";

    public static WebElement getCounter (WebDriver wd){
        return wd.findElement(By.xpath(counterXpath));
    }

}
