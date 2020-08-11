package com.kodilla.testing2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {

    public static final String SEARCHFIELD = "gh-ac";

    public static void main (String []args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.ebay.com");

        WebElement searchLaptop = driver.findElement(By.id(SEARCHFIELD));
        searchLaptop.sendKeys("Laptop");
        searchLaptop.submit();
    }
}


