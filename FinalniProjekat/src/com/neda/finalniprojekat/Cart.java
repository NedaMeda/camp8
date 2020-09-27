package com.neda.finalniprojekat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {

    private static String titleID = "layer_cart_product_title";
    private static String attributesID = "layer_cart_product_attributes";
    private static String quantityID = "layer_cart_product_quantity";

    public static WebElement getTitle(WebDriver wd) {
        return wd.findElement(By.id(titleID));
    }

    public static WebElement getAttributes(WebDriver wd) {
        return wd.findElement(By.id(attributesID));
    }

    public static WebElement getQuantity(WebDriver wd) {
        return wd.findElement(By.id(quantityID));
    }


}
