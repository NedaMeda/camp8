package com.neda.finalniprojekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {

    public static String url = "http://automationpractice.com/index.php?controller=contact";
    private static String subjectCSS = "#id_contact";
    private static String emailXpath = "//input[@id='email']";
    private static String referenceXpath = "//input[@id='id_order']";
    private static String fileXpath = "//input[@id='fileUpload']";
    private static String fileName = "";
    private static String messageXpath = "//textarea[@id='message']";
    private static String sendXpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]";

    public static WebElement getSubject(WebDriver wd) {
        return wd.findElement(By.cssSelector(subjectCSS));
    }

    public static WebElement getEmail(WebDriver wd) {
        return wd.findElement(By.xpath(emailXpath));
    }

    public static WebElement getReference(WebDriver wd) {
        return wd.findElement(By.xpath(referenceXpath));
    }

    public static WebElement getFile(WebDriver wd) {
        return wd.findElement(By.xpath(fileXpath));
    }

    public static WebElement getMessage(WebDriver wd) {
        return wd.findElement(By.xpath(messageXpath));
    }

    public static WebElement getSend(WebDriver wd) {
        return wd.findElement(By.xpath(sendXpath));
    }


}
