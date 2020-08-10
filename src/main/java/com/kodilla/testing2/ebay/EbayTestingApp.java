package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTestingApp {

    public static final String SEARCHFIELD = "gh-tb ui-autocomplete-input";

    public static void main (String []args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.ebay.com");

        WebElement searchLaptop = driver.findElement(By.className(SEARCHFIELD));
        searchLaptop.sendKeys("Laptop");
        searchLaptop.submit();
    }
}
