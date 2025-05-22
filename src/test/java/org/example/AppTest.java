package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AppTest extends DriverSetup{

    @Test
    public void testWebPageLoad() {
        driver.get("https://google.com");
        driver.getCurrentUrl();

    }

    @Test
    public void testWebPageTitle() {
        driver.get("https://google.com");
        driver.close();
    }
}