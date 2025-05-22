package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends DriverSetup{

    @Test
    public void testLocators() throws InterruptedException {
        driver.get("https://www.google.com");

        WebElement searchArea;

     //   WebElement searchArea = driver.findElement(By.id("APjFqb"));

     //   WebElement searchArea = driver.findElement(By.name(""));

     //   searchArea = driver.findElement(By.className("gLFyf"));

        searchArea = driver.findElement(By.tagName("textarea"));


        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);
        searchArea.clear();
        Thread.sleep(3000);
        driver.manage().window().maximize();



        driver.findElement(By.partialLinkText("সার্চ কীভাবে কাজ করে")).click();
        Thread.sleep(3000);

        driver.navigate().back();


        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);
    }
}